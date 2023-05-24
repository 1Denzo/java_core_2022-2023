package LR10.Example1XML.ParcerXML;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;


public class Parcer {

    private static final String TAG_PATHFILE = "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example1XML\\motobike.xml";

    private static final String TAG_VENDOR = "Vendor";
    private static final String TAG_ID = "id";
    private static final String TAG_MODEL = "Model";
    private static final String TAG_AGE = "age";

    public MotobikesList parsMoto() {
        Document doc = buildDocument();
        Node rootNode = doc.getFirstChild();
        NodeList rootChilds = rootNode.getChildNodes();
        String mainName = null;
        int id, age = 0;
        String model = "", vendor = "";
        ArrayList<Motobike> bikelist = new ArrayList<>();
        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            NamedNodeMap attributes = rootChilds.item(i).getAttributes();  // атрибуты дочернего узла
            id = Integer.valueOf(attributes.getNamedItem(TAG_ID).getNodeValue());// получение и преобразование в int значение атрибута
            mainName = rootChilds.item(i).getNodeName();
           //motobike1.setName(mainName);
            //motobike1.setId(id);

            NodeList motobike = rootChilds.item(i).getChildNodes();
            for (int j = 0; j < motobike.getLength(); j++) {
                if (motobike.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                switch (motobike.item(j).getNodeName()) {
                    case TAG_VENDOR: {
                        vendor = motobike.item(j).getTextContent();
                        break;
                    }
                    case TAG_MODEL: {
                        model = motobike.item(j).getTextContent();
                        break;
                    }
                    case TAG_AGE: {
                        age = Integer.valueOf(motobike.item(j).getTextContent());
                        break;
                    }
                    default:
                        throw new IllegalStateException("Unexpected value: " + motobike.item(j).getNodeName());
                }
            }
            Motobike motobike1 = new Motobike(id, vendor, model, age);
            //motobikesList.addMotobike(motobike1);
            bikelist.add(motobike1);

        }
        MotobikesList motobikesList = new MotobikesList(mainName, bikelist);
        return motobikesList;
    }

    private Document buildDocument() {
        File file = new File(TAG_PATHFILE);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            System.out.println("Ошибка открытия парсинга!!!" + e.toString());
        }
        return doc;
    }
    }


