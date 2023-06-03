package LR10.Example1XML.ParcerXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class addNode {
    // Метод для добавления новых нодов в XML файл
    public ArrayList<Motobike> addnode(String mainName, ArrayList<Motobike> bikeList) throws TransformerException, ParserConfigurationException {

        Scanner in = new Scanner(System.in);
        String inVend, inModel = null;
        int inAge, inAgeI, k = 0;
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();
        System.out.println("Введите количество дополнительных элементов списка " + mainName + ":");
        int elementNumber = in.nextInt();
        System.out.println("Введите номер индификатора для первого добавляемого элемета списка " + mainName + ":");
        int delimiter = in.nextInt();
        // Общий метод разделения списка на два подсписка в Java
        ArrayList<Motobike> parent = bikeList;
        ArrayList<Motobike> first = new ArrayList(); // создаем два пустых списка для деления parent
        ArrayList<Motobike> second = new ArrayList();// создаем два пустых списка для деления parent
        // обрабатываем каждый элемент и добавляем его в первый или второй список в зависимости от его позиции
        for (int i = 0; i < parent.size(); i++) {
            if (i < (delimiter - 1)) {
                first.add(parent.get(i));
            } else {
                second.add(parent.get(i));
            }
        }
        for (int i = 0; i < second.size(); i++) { //Добавление новых элементов в массив second
            if (i < elementNumber) {
                System.out.println("Введите название фирмы-изготовителя мотоцикла " + (i + 1) + ":");
                inVend = in.next();
                System.out.println("Введите название модели мотоцикла " + (i + 1) + ":");
                inModel = in.next();
                System.out.println("Введите год выпуска мотоцикла " + (i + 1) + ":");
                inAgeI = in.nextInt();
                inAge = (year - inAgeI);
                Motobike motobike2 = new Motobike((i + delimiter), inVend, inModel, inAge);
                second.add(i, motobike2);
            } else {
                second.get(i).setId(i + delimiter); //Устанавливаем правильную нумерацию атрибута id
            }
            //rootNode.appendChild(setMotobike(doc, k, inVend, inModel, inAgeS));
        }
        first.addAll(second); //объединяем списки
        return first;
    }

    //Метод для записи обьекта MotobikeList в файл
    protected void fileWriter(String mainName, ArrayList<Motobike> first) throws ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc2 = docBuilder.newDocument();
        Element rootElement = doc2.createElement(mainName);
        doc2.appendChild(rootElement);
        for (int j = 0; j < first.size(); j++) {
            //Добавление мотоциклов в объект doc2
            Element motobike = doc2.createElement("Motobike");
            motobike.setAttribute("id", first.get(j).getId());
            rootElement.appendChild(motobike);

            Element Vendor = doc2.createElement("Vendor");
            Vendor.appendChild(doc2.createTextNode(first.get(j).getVendor()));
            motobike.appendChild(Vendor);

            Element Model = doc2.createElement("Model");
            Model.appendChild(doc2.createTextNode(first.get(j).getModel()));
            motobike.appendChild(Model);

            Element Age = doc2.createElement("Age");
            Age.appendChild(doc2.createTextNode(first.get(j).getAge()));
            motobike.appendChild(Age);
        }

        try {
            //Запись XML-файла из объекта doc2
            doc2.setXmlStandalone(true);
            doc2.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new DOMSource(doc2);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("C:\\Users\\denzo\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example1XML\\ParcerXML\\MotobikeList.xml"));
            transformer.transform(source, result);
            System.out.println("Файл XML успешно записан!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }

    }
}

















        
