package LR10.Example1XML;

import java.io.File;
import java.util.Scanner;

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
import java.time.LocalDate;
// https://javadevblog.com/kak-sozdat-xml-fajl-na-java-ispol-zuem-dom-parser.html -- Источник вдохновления для кода
public class DOMxmlWriter {

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Scanner in = new Scanner(System.in);
        String inVend, inModel, inAgeS;
        int inAgeI;
        String k;
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();

        try {
            builder = factory.newDocumentBuilder();

            // создаем пустой объект Document, в котором будем создавать xml-файл
            Document doc = builder.newDocument();
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
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
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
    private static Node getMotobike(Document doc, String id, String vendor,String model, String age) {
        Element Motobike = doc.createElement("Motobike");

        // устанавливаем атрибут id
        Motobike.setAttribute("id", id);

        // создаем элемент Vendor
        Motobike.appendChild(getMotobikeElements(doc, "Vendor", vendor));

        // создаем элемент Model
        Motobike.appendChild(getMotobikeElements(doc, "Model", model));

        // создаем элемент age
        Motobike.appendChild(getMotobikeElements(doc, "age", age));
        return Motobike;
    }


    // утилитный метод для создания нового узла XML-файла
    private static Node getMotobikeElements(Document doc, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

}
