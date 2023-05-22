package LR10.Example1XML.ParcerXML;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Parcer {

    private static final String TAG_PATHFILE = "C:\\Users\\denzo\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example1XML\\motobike.xml";

    private static final String TAG_VENDOR = "Vendor";
    private static final String TAG_ID = "id";
    private static final String TAG_MODEL = "Model";
    private static final String TAG_AGE = "age";

    public Motobikes pars() {
        Document doc;

        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.out.println("Ошибка открытия парсинга!!!" + e.toString());
            return null;
        }
        Motobikes motobikes2 = parsMoto(doc);
        return motobikes2;
    }

        public Motobikes parsMoto(Document doc) {
            //Motobikes motobikes1 = null;
            Node rootNode = doc.getFirstChild();
            NodeList rootChilds = rootNode.getChildNodes();
            //  NodeList motobike = null;
            String mainName;
            int id, age = 0;
            String model = "", vendor = "";
            Motobikes motobikes1 = null;
            for (int i = 0; i < rootChilds.getLength(); i++) {
                if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                NamedNodeMap attributes = rootChilds.item(i).getAttributes();  // атрибуты дочернего узла
                id = Integer.valueOf(attributes.getNamedItem(TAG_ID).getNodeValue());// получение и преобразование в int значение атрибута
                mainName = rootChilds.item(i).getNodeName();
                //motobikes1.setName(mainName);
                //motobikes1.setId(id);

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
                motobikes1 = new Motobikes(mainName, id, vendor, model, age);
            }
            return motobikes1;
        }

    private Document buildDocument() throws ParserConfigurationException, IOException, SAXException {
        File file = new File(TAG_PATHFILE);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }}

