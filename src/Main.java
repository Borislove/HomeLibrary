import java.util.Scanner;

public class Main {

    //public static String sc = new Scanner(System.in).nextLine();

    public static void main(String[] args) {
        //new Home_Library("Pupkin", "Vasya", "Sergeevich", "philosophy", 777, 2011, "Dialectic");
        //    System.out.println(new Home_Library("Pupkin", "Vasya", "Sergeevich", "philosophy", 777, 2011, "Dialectic"));

        Author av = new Author();

        System.out.println("Имя");
        av.first_name = new Scanner(System.in).nextLine();
        System.out.println("Фамилия");
        av.last_name = new Scanner(System.in).nextLine();
        System.out.println("Отчество");
        av.middle_name = new Scanner(System.in).nextLine();


        System.out.print ("Имя: ");
        System.out.println(av.first_name);

        System.out.print("Фамилия: ");
        System.out.println(av.last_name);

        System.out.print("Отчество: ");
        System.out.print(av.middle_name);
    }
}
