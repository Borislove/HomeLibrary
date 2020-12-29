
//по горизонтали
public class Test {

    static String last_name = "Тестович"; //фамилия
    static String first_name = "Тестик"; //имя
    static String middle_name = "Тестируемый"; //отчество?

    static String genre = "тестовый"; //жанр

    static int number_of_pages = 101; //number of pages //количество стр.
    static int year_of_publication = 2021; //year_of_publication //год издания
    static String publiching_house = "вымышленное"; //publishing house //издательство

    static String crust = "мягкий"; //корка?, переплёт

    static String tittle_book = "тест№1"; //название книги

    static String delimiter = " | ";

    //static String column1Format = "%-3.3s";
    static String column1Format = "%-8.10s";

    public static void main(String[] args) {

        /*System.out.print("Фамилия"+delimiter);
        System.out.print("Имя"+delimiter);
        System.out.print("Отчество"+delimiter);*/
        System.out.print("Автор"+delimiter);
        System.out.print("Жанр"+delimiter);
        System.out.print("Название книги"+delimiter);
        System.out.print("Кол-во стр"+delimiter);
        System.out.print("Год издания"+delimiter);
        System.out.print("Издательство"+delimiter);
        System.out.print("Переплёт"+delimiter);

        System.out.print("\n");

        System.out.print(last_name);
        System.out.print(genre);
        System.out.print(tittle_book);
        System.out.print(number_of_pages);
        System.out.print(year_of_publication);
        System.out.print(publiching_house);
        System.out.print(crust);

        System.out.print("\n");

        System.out.format(column1Format, last_name);
        System.out.format(column1Format, genre);
        System.out.format(column1Format, tittle_book);
        System.out.format(column1Format, number_of_pages);
        System.out.format(column1Format, year_of_publication);
        System.out.format(column1Format, publiching_house);
        System.out.format(column1Format, crust);

    }
}


/*Имя: Вася
Фамилия: Пупкин
Отчество: Олегович
Название книги: без названия
Жанр: ужастик
Количество страниц: 666
Год издания: 2021
Издательство: нету
Обложка/Переплёт: твёрдый*/