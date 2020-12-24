import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestID {

    public static void main(String[] args) throws IOException {

        String count = "";
        //прочли файл, 1 строчку
        FileReader reader = new FileReader("src\\out\\test1.txt");
        Scanner scanner = new Scanner(reader);

        char[] arr = scanner.nextLine().toCharArray();
        for (Character value : arr) {
            if (Character.isDigit(value)) {
                count += value;
            }
        }
        System.out.println(count);

        //не выше, после чтения
        Integer num = Integer.parseInt(count);
        System.out.println("num: " + num);
        num++;
        System.out.println("Добавили нового автора");
        System.out.println("num: " + num);

        FileWriter fw = new FileWriter("src\\out\\test1.txt", false);
        //fw.write(scanner.nextLine());
        fw.write("count id: " + num);

        reader.close();
        fw.close();

    }
}
