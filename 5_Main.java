import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        В библиотеке решили автоматизировать учет книг
//        Создать класс Books со следующими полями
//            - название книги
//            - автора книги
//            - количество страниц
//            - на какое количество дней выдана книга (в сутках)
//
//        Создать один сеттер для ввода этих 4х полей (метод с 4 аргументами)
//        Создать 4 геттера для возвращения этих полей main
//
//        В main создать 5 объектов типа Books
//        Организовать ввод, вывод.

        String name, author;
        int page, days;
        char yn;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        Books b1 = new Books();
        Books b2 = new Books();
        Books b3 = new Books();
        Books b4 = new Books();
        Books b5 = new Books();

        b1.setBooks("Algorithms in Java", "Robert Sedgewick", 764, 100);
        b2.setBooks("Effective Java", "Joshua Bloch", 901, 120);
        b3.setBooks("Exploring Java", "Fu Cheng", 179, 50);
        b4.setBooks("Mastering Concurrency Programming with Java 8", "Javier Fernández González", 426, 72);
        b5.setBooks("Java Language Features", "Kishori Sharan", 915, 130);

        name = b1.getName(); author = b1.getAuthor(); page = b1.getPage(); days = b1.getDays();
        System.out.printf("Первая книга.\nНазвание: %s\nАвтор: %s\nКол-во страниц: %d\nКол-во дней: %d\n\n",name, author, page, days);
        name = b2.getName(); author = b2.getAuthor(); page = b2.getPage(); days = b2.getDays();
        System.out.printf("Вторая книга.\nНазвание: %s\nАвтор: %s\nКол-во страниц: %d\nКол-во дней: %d\n\n",name, author, page, days);
        name = b3.getName(); author = b3.getAuthor(); page = b3.getPage(); days = b3.getDays();
        System.out.printf("Третья книга.\nНазвание: %s\nАвтор: %s\nКол-во страниц: %d\nКол-во дней: %d\n\n",name, author, page, days);
        name = b4.getName(); author = b4.getAuthor(); page = b4.getPage(); days = b4.getDays();
        System.out.printf("Четвертая книга.\nНазвание: %s\nАвтор: %s\nКол-во страниц: %d\nКол-во дней: %d\n\n",name, author, page, days);
        name = b5.getName(); author = b5.getAuthor(); page = b5.getPage(); days = b5.getDays();
        System.out.printf("Пятая книга.\nНазвание: %s\nАвтор: %s\nКол-во страниц: %d\nКол-во дней: %d\n\n",name, author, page, days);

        while (flag) {
        System.out.println("Хотите добавить книгу? (y/n) ");
        yn = sc.next().charAt(0);
            if (yn == 'y') {
                Books book = new Books();
                System.out.println("Введите название книги: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.println("Введите автора книги: ");
                author = sc.nextLine();
                System.out.println("Введите количество страниц: ");
                page = sc.nextInt();
                System.out.println("На какое кол-во дней выдана книга? ");
                days = sc.nextInt();
                book.setBooks(name, author, page, days);
                name = book.getName(); author = book.getAuthor(); page = book.getPage(); days = book.getDays();
                System.out.printf("Книга добавлена.\nНазвание: %s\nАвтор: %s\nКол-во страниц: %d\nКол-во дней: %d\n\n",name, author, page, days);
            } else if (yn == 'n') {
                System.out.println("Пока");
                flag = false;
            } else System.out.println("Не понял Вас");
        }

    }
}