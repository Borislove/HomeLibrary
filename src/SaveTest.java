import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class SaveTest {

    public static void main(String[] args) throws IOException {

        String str = JOptionPane.showInputDialog("Укажите путь для сохранения файла");
        String strTest = "test.txt";

        FileWriter writer = new FileWriter(str + strTest);
        writer.close();
    }
}

//C:\Users\User\Desktop\