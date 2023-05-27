package LR10.Example1XML.ParcerXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class addNode {

        public static void main(String[] args) {
            Parcer parcer = new Parcer();
            Document doc = parcer.buildDocument();

            Scanner in = new Scanner(System.in);
            String inVend, inModel, inAgeS = null;
            int inAgeI = 0;
            String k = null;
            LocalDate date = LocalDate.now(); // получаем текущую дату
            int year = date.getYear();

            try {
                // создаем корневой элемент
                Element rootElement =
                        doc.createElement("Motobike");
                // добавляем корневой элемент в объект Document
                doc.appendChild(rootElement);
                System.out.println("Введите количество элементов списка " + rootElement.getTagName()+ ":");
                int elementNumber = in.nextInt();
                for (int i = 0; i < elementNumber; i++) {
                    k = String.valueOf(i + 1);
                    System.out.println("Введите название фирмы-изготовителя мотоцикла " + k + ":");
                    inVend = in.next();
                    System.out.println("Введите название модели мотоцикла " + k + ":");
                    inModel = in.next();
                    System.out.println("Введите год выпуска мотоцикла " + k + ":");
                    inAgeI = in.nextInt();
                    inAgeS = String.valueOf(year-inAgeI);

                    // добавляем первый дочерний элемент к корневому
                    rootElement.appendChild(getMotobike(doc, k, inVend, inModel, inAgeS));
                }
                //создаем объект TransformerFactory для печати в консоль
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                // для красивого вывода в консоль
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(doc);

                //печатаем в консоль и в файл
                StreamResult console = new StreamResult(System.out);
                StreamResult file = new StreamResult(new File("src/LR10/Example1XML/motobike.xml"));

                //записываем данные
                transformer.transform(source, console);
                transformer.transform(source, file);
                System.out.println("Создание XML файла закончено");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // метод для создания нового узла XML-файла
        private static Node getMotobike(Document doc, String id, String vendor, String model, String age) {
            Element Motobike = doc.createElement("Motobike");

            // устанавливаем атрибут id
            Motobike.setAttribute("id", id);

            // создаем элемент Vendor
            Motobike.appendChild(getMotobikeElements(doc, Motobike, "Vendor", vendor));

            // создаем элемент Model
            Motobike.appendChild(getMotobikeElements(doc, Motobike, "Model", model));

            // создаем элемент age
            Motobike.appendChild(getMotobikeElements(doc, Motobike, "age", age));
            return Motobike;
        }


        // утилитный метод для создания нового узла XML-файла
        private static Node getMotobikeElements(Document doc, Element element, String name, String value) {
            Element node = doc.createElement(name);
            node.appendChild(doc.createTextNode(value));
            return node;
        }
}
