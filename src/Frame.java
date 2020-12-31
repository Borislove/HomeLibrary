import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    JTextField field1;
    JTextArea jTextArea;

    public Frame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        field1 = new JTextField(30);

       /* JLabel label2 = new JLabel("Автор:");  //метка
        c.add(label2);*/

        setLayout(new FlowLayout());

        add(new JLabel("id:"));
        add(new JTextArea("       "));


        add(new JLabel("Автор:"));
        add(new JTextArea("       "));

        /*jTextArea = new JTextArea();
        c.add(jTextArea);*/

        add(new JLabel("Жанр:"));
        add(new JTextArea("         "));


        add(new JLabel("Название книги:"));
        add(new JTextArea("         "));

        add(new JLabel("кол-во стр:"));
        add(new JTextArea("         "));

        add(new JLabel("Год издания:"));
        add(new JTextArea("         "));

        add(new JLabel("Издательство:"));
        add(new JTextArea("         "));

        add(new JLabel("Переплёт:"));
        add(new JTextArea("         "));

        add(new JButton("добавить"));


        setSize(800, 700);
       // setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setVisible(true);
    }

    public static void main(String[] args) {

        Frame f = new Frame("test");
    }
}
