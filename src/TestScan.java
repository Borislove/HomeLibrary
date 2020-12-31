import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// TODO: 31.12.2020 next, считывает 1 только 
public class TestScan {

    static String last_name; //фамилия
    static String first_name = ""; //имя
    static String middle_name; //отчество?

    public TestScan(String last_name, String first_name, String middle_name) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.middle_name = middle_name;
    }

    public static String getLast_name() {
        return last_name;
    }

    public static String getFirst_name() {
        return first_name;
    }

    public static String getMiddle_name() {
        return middle_name;
    }
}

class UseTestScan extends JFrame {

    public UseTestScan() throws IOException {
        TestScan testScan;
        Scanner key = new Scanner(new File("E:\\HomeLibrary\\src\\out\\test4.txt"));

        testScan = new TestScan(key.next(), key.next(), key.next());

        info(testScan);

        setLayout(new GridLayout(9,2,20,3)); // TODO: 31.12.2020 если отключить, лейбы друг на друге будут
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //  pack();

        setSize(300, 300);
        setVisible(true);
    }

    private void info(TestScan testScan) {
        add(new JLabel(testScan.getLast_name()));
        add(new JLabel(testScan.getFirst_name()));
        add(new JLabel(testScan.getMiddle_name()));
    }
}

class Show {
    public static void main(String[] args) throws IOException {
        new UseTestScan();
    }
}