import java.util.Scanner;

public class Test7 {

    private static String last_name; //фамилия
    private static String first_name; //имя
    private static String middle_name; //отчество?

    Test7(String last_name, String first_name, String middle_name) {
        this.last_name = last_name;
        test_correction(last_name);
        this.first_name = first_name;
        test_correction(first_name);
        this.middle_name = middle_name;
        test_correction(middle_name);
    }

    private void test_correction(String str) {
        for (
                Character value : str.toCharArray()) {
            if (Character.isDigit(value)) {  //цифра или
                System.err.println("middle_name" + "не может содержать цифру");
                System.exit(0);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return last_name + " " + first_name + " " + middle_name;
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("last_name pls");
        last_name = key.next();
        System.out.println("first_name pls");
        first_name = key.next();
        System.out.println("middle_name pls");
        middle_name = key.next();
        Test6 t = new Test6(last_name, first_name, middle_name);
    }
}





