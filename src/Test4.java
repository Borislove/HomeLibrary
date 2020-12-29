import java.util.Scanner;

// TODO: 29.12.2020 если убрать override, не будет выводится, test2 
public class Test4 extends Test2 {

    public Test4(String last_name, String first_name, String middle_name) {
        super(last_name, first_name, middle_name);
    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("last_name pls");
        String last_name = key.nextLine();
        System.out.println("middle_name pls");
        String first_name = key.nextLine();
        System.out.println("first_name pls");
        String middle_name = key.nextLine();

//        Test4 t = new Test4(key.nextLine(), key.nextLine(), key.nextLine());
        Test4 t = new Test4(last_name, first_name,middle_name);
        System.out.println(t);
    }
}


/*last_name pls
first_name pls
middle_name pls
test
testing
testovich
test testing testovich*/