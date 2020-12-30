import javax.swing.*;


public class Frame extends JFrame {

    static JFrame f = new JFrame();
    static JButton jButton;
    static JPanel jPanel;

    static JPanel jPanel123;

    static JTextArea jTextArea;

    public static void main(String[] args) {
        f.setSize(800, 700);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setAlwaysOnTop(true);

        jButton = new JButton("добавить");
        jPanel = new JPanel();
        jPanel.add(jButton);
        f.add(jPanel);


        f.setVisible(true);

        jTextArea = new JTextArea("HELLO");
        jTextArea.setEditable(false);

        jPanel123 = new JPanel();
        jPanel123.add(jTextArea);
        f.add(jTextArea);


    }
}
