import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("E:\\HomeLibrary\\src\\out\\test2"));

      /*  String s = scanner.next();
        String[] str = s.split("\\w+");

        System.out.println(Arrays.toString(str));*/

        while (scanner.hasNextLine()) {

      /*      if (scanner.nextLine().equals("id")) { //проверит если есть только это значение, но никак не больше
                System.out.println("test");
            }

            if (scanner.nextLine().equals("test")) {
                System.out.println("test2");
            }*/

            System.out.print(scanner.next());
            System.out.print(scanner.next());
            System.out.print(scanner.next());
            if (scanner.next().equals("\n")) {
                System.out.println("err");
            }

            //System.out.println(scanner.nextLine()); //выведет все


            /*if (.equals("id")) {
                System.out.println("test");
                //System.out.println(scanner.nextLine());
            }*/

        }
        scanner.close();
    }
}