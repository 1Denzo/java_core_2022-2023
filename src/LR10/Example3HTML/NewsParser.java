package LR10.Example3HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class NewsParser {
    private static final String TAG_URL = "http://fat.urfu.ru/index.html";
    private static final String TAG_PATHFILE =
            "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example3HTML\\";

    public static void main(String[] args) {
        String s, d = null;
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Введите имя файла для сохранения результатов парсинга URL: " + TAG_URL + "\n");
        String fname = sc.nextLine();
        try {
            File fw = new File(TAG_PATHFILE + fname + ".txt");
            fw.createNewFile(); // файл создан
            System.out.println("Путь к файлу: " + fw.getAbsolutePath());
            BufferedWriter dOut = new BufferedWriter(new FileWriter(fw));
            // Получаем HTML-код страницы
            Document doc = Jsoup.connect(TAG_URL).get();
            // Извлекаем список новостей
            Elements newsParent = doc.
                    select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
            // Выводим 10 новостей в консоль
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    s = ("Тема: " + ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0));
                    System.out.println(s);
                    dOut.write(s + "\n");
                    d = ("Дата: " + ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0)
                            + "\n");
                    System.out.println(d);
                    dOut.write(d + "\n");
                }
            }
            System.out.println("Файл записан.");
            dOut.flush();
            dOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

