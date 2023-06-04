package LR10.Example1XML.ParcerXML;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;


public class Parcer {
    private static final String TAG_VENDOR = "Vendor";
    private static final String TAG_ID = "id";
    private static final String TAG_MODEL = "Model";
    private static final String TAG_AGE = "Age";
    private static final String TAG_MOTO = "Motobike";

    public MotobikesList
    parsMoto() {
        //Получение Document при помощи метода класса FileWorker из исходного файла
        FileWorker fileWorker = new FileWorker();
        Document doc = fileWorker.buildDocument();
        String mainName = fileWorker.mainName(doc);
        Node rootNode = doc.getFirstChild();
        NodeList rootChilds = rootNode.getChildNodes();
        int id, age = 0;
        String model = "", vendor = "";
        ArrayList<Motobike> bikelist = new ArrayList<>();
        //Парсинг doc, создание Motobike и ArrayList<Motobike>
        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            NamedNodeMap attributes = rootChilds.item(i).getAttributes();  // атрибуты дочернего узла
            id = Integer.valueOf(attributes.getNamedItem(TAG_ID).getNodeValue());// получение и преобразование в int значение атрибута
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
            bikelist.add(motobike1);
        }
        MotobikesList motobikesList = new MotobikesList(mainName, bikelist);
        return motobikesList;
    }
    public Document docCreator(MotobikesList motobikesList1) throws ParserConfigurationException {
        String mainName1 = motobikesList1.getMainName();
        ArrayList<Motobike> motobikeArrayList = motobikesList1.getMotobikesList();
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc2 = docBuilder.newDocument();
        Element rootElement = doc2.createElement(mainName1);
        doc2.appendChild(rootElement);
        for (int j = 0; j < motobikeArrayList.size(); j++) {
            //Добавление мотоциклов в объект doc2
            Element motobike = doc2.createElement(TAG_MOTO);
            motobike.setAttribute(TAG_ID, motobikeArrayList.get(j).getId());
            rootElement.appendChild(motobike);

            Element Vendor = doc2.createElement(TAG_VENDOR);
            Vendor.appendChild(doc2.createTextNode(motobikeArrayList.get(j).getVendor()));
            motobike.appendChild(Vendor);

            Element Model = doc2.createElement(TAG_MODEL);
            Model.appendChild(doc2.createTextNode(motobikeArrayList.get(j).getModel()));
            motobike.appendChild(Model);

            Element Age = doc2.createElement(TAG_AGE);
            Age.appendChild(doc2.createTextNode(motobikeArrayList.get(j).getAge()));
            motobike.appendChild(Age);
        }
        return doc2;
    }
    }


