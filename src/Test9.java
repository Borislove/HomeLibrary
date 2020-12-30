import java.util.Scanner;

public class Test9 {

    private static String last_name; //фамилия

    public Test9(String last_name) {
        this.last_name = last_name;
    }

    public static String getLast_name() {
        return last_name;
    }

    public static void setLast_name(String str) {
        if (!last_name.equals("")) {
            last_name = str;
        } else
            System.out.println("Ошибка! Пустое значение");
    }

    private static void test_correction(String str, String full) { //str вводимое значение, full-вводимое значение
        for (Character value : str.toCharArray()) {
            if (Character.isDigit(value)) {  //цифра или
                System.err.println(full + " не может содержать цифру");
                //   System.exit(0);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return last_name;
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("last_name pls");

        last_name = key.next();
        setLast_name(last_name);

        test_correction(last_name, "last_name");
    }
}
