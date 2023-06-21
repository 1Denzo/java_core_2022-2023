package Xperimental;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ScanFolder {
    public static void main(String[] args) {
        List<File> all = new ArrayList<>();
        addTree(new File("D:\\tmp"), all);
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i).toString());
        }
    }
    static void addTree(File file, List<File> all) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                all.add(child);
            }
        }
    }
}
