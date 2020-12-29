import java.util.Scanner;

//утилитка для проверки корректности вводимых значений т.е букв
public class Test1 {
    public static void main(String[] args) {
        //считываем
        Scanner key = new Scanner(System.in);
        String in = key.next();

        boolean b = true;
        System.out.println(b);

        //запихиваем в массив
        char[] arr = in.toCharArray();

        //проверка
        for (Character value : arr) {
            if (Character.isLetter(value) && !(Character.isDigit(value))) {
                System.out.println("Все правильно");
            } else {
                System.err.println("присутствует цифра или символ: " + value); //и включить false?
                b = false;
            }
        }

        System.out.println(b);

        if (b) {
            System.out.println("ok , доступ разрешен");
        }else {
            System.out.println("no , в доступе отказано");
        }
    }
}


/*1!@#$%^&*(*
true
присутствует цифра или символ: 1
присутствует цифра или символ: !
присутствует цифра или символ: @
присутствует цифра или символ: #
присутствует цифра или символ: $
присутствует цифра или символ: %
присутствует цифра или символ: ^
присутствует цифра или символ: &
присутствует цифра или символ: *
присутствует цифра или символ: (
присутствует цифра или символ: *
false
no , в доступе отказано*/