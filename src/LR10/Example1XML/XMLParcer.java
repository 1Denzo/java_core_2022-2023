package LR10.Example1XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
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
                Scanner sc = new Scanner(System.in, "UTF-8");
                System.out.println("Парсер XML v.0.1\n:");
                System.out.print("Введите путь к файлу XML => ");
                pathFile = sc.nextLine();
                do {
                    System.out.println("Парсер XML v.0.1\n:");
                    System.out.println("Выберите действие: ");
                    System.out.println(" 1. Добавление узла в файл XML");
                    System.out.println(" 2. Удаление узлa в файле XML");
                    System.out.println(" 3. Поиск по полям в файле XML");
                    System.out.println(" 4. Парсинг в консоль файла XML");
                    System.out.println(" 5. Выход\n");
                    System.out.println("Bыбepитe нужный пункт:");
                    choice = (char) System.in.read();
                }
                while (choice < '1' || choice > '5');
                System.out.println("\n");
                switch (choice) {
                    case '1':
                        try {
                            Transformer transformer = TransformerFactory.newInstance().newTransformer();
                            DOMSource source = new DOMSource(doc);
                            StreamResult result = new StreamResult(new File(pathFile));
                            transformer.transform(source, result);
                            break;
                            case '2':
                                System.out.println("switch:\n");
                                System.out.println("switсh(выражение) {");

                                File xmlFile = new File(pathFile);
                                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                                DocumentBuilder builder;
                                try {
                                    builder = factory.newDocumentBuilder();
                                    Document doc = builder.parse(pathFile);
                                    doc.getDocumentElement().normalize();

                                    // обновляем значения
                                    updateElementValue(doc);

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

                                break;
                        } catch (TransformerConfigurationException e) {
                            throw new RuntimeException(e);
                        } catch (TransformerException e) {
                            throw new RuntimeException(e);
                        }
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

