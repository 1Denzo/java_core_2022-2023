package LR10.Example1XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class XMLParcer {

            //Использовать оператор цикла do-while для выбора пункта меню
            public static void main(String args[])
                    throws java.io.IOException, ParserConfigurationException {
                char choice;
                String pathFile = null;
                do {
                    System.out.println("Парсер XML v.0.1\n:");
                    System.out.println("Выберите действие: ");
                    System.out.println(" 1. Редактирование пути файла для парсинга");
                    System.out.println(" 2. Добавление узла в файл XML");
                    System.out.println(" 3. Удаление узлa в файле XML");
                    System.out.println(" 4. Поиск по полям в файле XML");
                    System.out.println(" 5. Парсинг в консоль файла XML");
                    System.out.println(" 6. Выход\n");
                    System.out.println("Bыбepитe нужный пункт:");
                    choice = (char) System.in.read();
                }
                while (choice < '1' || choice > '5') ;
                System.out.println("\n");
                switch (choice) {
                    case '1':
                        Scanner sc = new Scanner(System.in, "UTF-8");
                        System.out.print("Введите путь к файлу XML => ");
                        pathFile = sc.nextLine();
                        break;
                    case '2':
                        System.out.println("switch:\n");
                        System.out.println("switсh(выражение) {");
                        System.out.println(" case константа:");
                        public class DOMxmlEdit {
                                File xmlFile = new File(pathFile);
                                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                                DocumentBuilder builder;
                                try {
                                    builder = factory.newDocumentBuilder();
                                    Document doc = builder.parse(pathFile);
                                    doc.getDocumentElement().normalize();

                                    // обновляем значения
                                    updateElementValue(doc);

                                    // добавляем новый элемент
                                    addElement(doc);

                                    // запишем отредактированный элемент в файл
                                    // или выведем в консоль
                                    doc.getDocumentElement().normalize();
                                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                                    Transformer transformer = transformerFactory.newTransformer();
                                    DOMSource source = new DOMSource(doc);
                                    StreamResult result = new StreamResult(new File(pathFile));
                                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                                    transformer.transform(source, result);
                                    System.out.println("XML успешно изменен!");

                                } catch (Exception exc) {
                                    exc.printStackTrace();
                                }
                            }

                            // добавили элемент paradigm
                            private static void addElement(Document doc) {
                                NodeList languages = doc.getElementsByTagName("Motobike");
                                Element lang = null;

                                //проходим по каждому элементу Language
                                for(int i=0; i<languages.getLength(); i++){
                                    lang = (Element) languages.item(i);
                                    Element paradigmElement = doc.createElement("Engine");
                                    paradigmElement.appendChild(doc.createTextNode("oop"));
                                    lang.appendChild(paradigmElement);
                                }
                            }

                            // изменяем значение существующего элемента name
                            private static void updateElementValue(Document doc) {
                                NodeList languages = doc.getElementsByTagName("Language");
                                Element lang = null;
                                // проходим по каждому элементу Language
                                for(int i=0; i<languages.getLength();i++){
                                    lang = (Element) languages.item(i);
                                    Node name = lang.getElementsByTagName("name").item(0).getFirstChild();
                                    name.setNodeValue(name.getNodeValue().toUpperCase());
                                }
                            }
                        }
                        break;
                    case '3':
                        System.out.println("while:\n");
                        System.out.println("while(ycлoвиe) оператор;");
                        break;
                    case '4':
                        System.out.println("do-while:\n");
                        System.out.println("do {");
                        System.out.println(" оператор;");
                        System.out.println("} while (условие);");
                        break;
                    case '5':
                        try {
                            File inputFile = new File(pathFile);
                            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                            Document doc = dBuilder.parse(inputFile);
                            doc.getDocumentElement().normalize();
                            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
                            NodeList nodeList = doc.getElementsByTagName("Motobike");
                            for (int i = 0; i < nodeList.getLength(); i++) {
                                Node node = nodeList.item(i);
                                System.out.println("\nТекущий элемент: " + node.getNodeName());
                                if (node.getNodeType() == Node.ELEMENT_NODE) {
                                    Element element = (Element) node;
                                    System.out.println("Производитель: "
                                            + element.getElementsByTagName("Vendor").item(0).getTextContent());
                                    System.out.println("Модель: "
                                            + element.getElementsByTagName("Model").item(0).getTextContent());
                                    System.out.println("Возраст: "
                                            + element.getElementsByTagName("age").item(0).getTextContent());
                                }
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
        }

}
}