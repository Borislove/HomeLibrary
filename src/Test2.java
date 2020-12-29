public class Test2 {

    private static String last_name; //фамилия
    private static String first_name = ""; //имя
    private static String middle_name; //отчество?


    Test2(String last_name, String first_name, String middle_name) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.middle_name = middle_name;
    }


    /*Test2(String last_name){
        this.last_name = last_name;
    }*/


    public static void main(String[] args) {
        Test2 t = new Test2("Vasilev", "Serg", "Sergeevich");
        /*t.last_name = "last_name";
        t.first_name = "first_name";
        t.middle_name = "middle_name";*/
        System.out.println(t.toString()); //+
        System.out.println(t); //+
    }

    @Override
    public String toString() {
        return last_name +" "+first_name+" "+middle_name;
    }
}


