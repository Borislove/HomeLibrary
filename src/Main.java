import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//при воде ф.и.о не должно быть символов
//1 буква ф, должна быть большой
//и.о , инициалы, если одна бука то ставить точку
public class Main {

    //public static String sc = new Scanner(System.in).nextLine();

    public static void main(String[] args) throws IOException {
        //new Home_Library("Pupkin", "Vasya", "Sergeevich", "philosophy", 777, 2011, "Dialectic");
        //    System.out.println(new Home_Library("Pupkin", "Vasya", "Sergeevich", "philosophy", 777, 2011, "Dialectic"));

        Author av = new Author();
        Home_Library hl = new Home_Library();

        System.out.println("Имя");
        av.first_name = new Scanner(System.in).nextLine();
        System.out.println("Фамилия");
        av.last_name = new Scanner(System.in).nextLine();
        System.out.println("Отчество");
        av.middle_name = new Scanner(System.in).nextLine();

        System.out.println("Жанр: ");
        hl.genre = new Scanner(System.in).nextLine();

        System.out.println("Кол-во страниц: ");
        hl.number_of_pages = new Scanner(System.in).nextInt();  // INTEGER!

        System.out.println("Год издания: ");
        hl.year_of_publication = new Scanner(System.in).nextInt();

        System.out.println("Издательство: ");
        hl.publiching_house = new Scanner(System.in).nextLine();

        System.out.println("Обложка(Переплёт)");
        hl.crust = new Scanner(System.in).nextLine();

      /*  System.out.print("Имя: ");
        System.out.println(av.first_name);

        System.out.print("Фамилия: ");
        System.out.println(av.last_name);

        System.out.print("Отчество: ");
        System.out.print(av.middle_name);*/

        //запись в файл
        FileWriter fw = new FileWriter("src\\out\\test.txt", true); //фальш на перезапись

        try {
            fw.write("------------------" + "\n");
            fw.write("Имя: " + av.first_name + "\n");
            fw.write("Фамилия: " + av.last_name + "\n");
            fw.write("Отчество: " + av.middle_name + "\n");

            fw.write("Жанр: " + hl.genre + "\n");
            fw.write("Количество страниц: " + hl.number_of_pages + "\n");
            fw.write("Год издания: " + hl.year_of_publication + "\n");
            fw.write("Издательство: " + hl.publiching_house + "\n");

            fw.write("Обложка/Переплёт: "+hl.crust+"\n");

            fw.write("------------------" + "\n");
        } finally {
            fw.close();
        }
    }
}
