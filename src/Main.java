import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    //public static String sc = new Scanner(System.in).nextLine();

    public static void main(String[] args) throws IOException {
        //new Home_Library("Pupkin", "Vasya", "Sergeevich", "philosophy", 777, 2011, "Dialectic");
        //    System.out.println(new Home_Library("Pupkin", "Vasya", "Sergeevich", "philosophy", 777, 2011, "Dialectic"));

        Author av = new Author();

        System.out.println("Имя");
        av.first_name = new Scanner(System.in).nextLine();
        System.out.println("Фамилия");
        av.last_name = new Scanner(System.in).nextLine();
        System.out.println("Отчество");
        av.middle_name = new Scanner(System.in).nextLine();


        System.out.print("Имя: ");
        System.out.println(av.first_name);

        System.out.print("Фамилия: ");
        System.out.println(av.last_name);

        System.out.print("Отчество: ");
        System.out.print(av.middle_name);


        //запись в файл
        FileWriter fw = new FileWriter("test", true);

        try {
            fw.write("------------------" + "\n");
            fw.write("Имя: " + av.first_name + "\n");
            fw.write("Фмилия: " + av.last_name + "\n");
            fw.write("Отчество: " + av.middle_name + "\n");
            fw.write("------------------" + "\n");
        } finally {
            fw.close();
        }
    }
}
