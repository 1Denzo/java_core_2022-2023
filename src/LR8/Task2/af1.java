package LR8.Task2;
// ����������� ����������� ����������
import java.io.BufferedWriter;
import java.io.FileWriter;
public class af1 {

    public static void main(String[] args) {
        try
        {
            // ������� ��������� ����
            FileWriter fw = new FileWriter("WriteData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // �������� ��������� ����� � ����
            bw.write("10");
            bw.newLine();
            bw.write("20");
            bw.newLine();
            bw.write("30");
            bw.newLine();

            // ��������� ����
            bw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}