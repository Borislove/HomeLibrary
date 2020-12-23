//тестовый класс

public class Home_Library {

    private String last_name; //фамилия
    private String first_name; //имя
    private String middle_name; //отчество?

    private String genre; //жанр

    private int nop; //number of pages //количество стр.
    private int yop; //year_of_publication //год издания
    private String ph; //publishing house //издательство

    private String crust; //корка?, переплёт

    public Home_Library(String last_name, String first_name, String middle_name, String genre, int nop, int yop, String ph) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.genre = genre;
        this.nop = nop;
        this.yop = yop;
        this.ph = ph;
    }
}
