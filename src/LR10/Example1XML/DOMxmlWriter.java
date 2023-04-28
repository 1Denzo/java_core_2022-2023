package LR10.Example1XML;

    import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
// https://javadevblog.com/kak-sozdat-xml-fajl-na-java-ispol-zuem-dom-parser.html
    public class DOMxmlWriter {

        public static void main(String[] args) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            try {
                builder = factory.newDocumentBuilder();

                // создаем пустой объект Document, в котором будем
                // создавать наш xml-файл
                Document doc = builder.newDocument();
                // создаем корневой элемент
                Element rootElement =
                        doc.createElement("Motobikes");
                // добавляем корневой элемент в объект Document
                doc.appendChild(rootElement);

                // добавляем первый дочерний элемент к корневому
                rootElement.appendChild(getMotobike(doc, "Honda", "TransAlp", "15"));

                //добавляем второй дочерний элемент к корневому
                rootElement.appendChild(getMotobike(doc, "Kawasaki", "Ninja", "17"));

                //создаем объект TransformerFactory для печати в консоль
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                // для красивого вывода в консоль
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(doc);

                //печатаем в консоль или файл
                StreamResult console = new StreamResult(System.out);
                StreamResult file = new StreamResult(new File("C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example1XML\\Motobike1.xml"));

                //записываем данные
                transformer.transform(source, console);
                transformer.transform(source, file);
                System.out.println("Создание XML файла закончено");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // метод для создания нового узла XML-файла
        private static Node getMotobike(Document doc, String vendor,String model, String age) {
            Element Motobike = doc.createElement("Motobike");

            // создаем элемент Vendor
            Motobike.appendChild(getLanguageElements(doc, "Vendor", vendor));

            // создаем элемент Model
            Motobike.appendChild(getLanguageElements(doc, "Model", model));

            // создаем элемент age
            Motobike.appendChild(getLanguageElements(doc, "age", age));
            return Motobike;
        }


        // утилитный метод для создание нового узла XML-файла
        private static Node getLanguageElements(Document doc, String name, String value) {
            Element node = doc.createElement(name);
            node.appendChild(doc.createTextNode(value));
            return node;
        }

    }
