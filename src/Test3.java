public class Test3 extends Test2 {

    public Test3(String last_name, String first_name, String middle_name) {
        super(last_name, first_name, middle_name);
    }


    public static void main(String[] args) {
        Test3 t = new Test3("Test", "testovich", "testing");
        System.out.println(t);
    }
}
