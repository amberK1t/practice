import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задание 1
//        Есть прямоугольник, у которого известна ширина w и
//        высота h. Найти и вывести на консоль периметр и площадь
//        заданного прямоугольника. Высота и ширина прямоугольника должна вводиться с клавиатуры

        Scanner S = new Scanner(System.in);
        int w, h, p, s;
        System.out.printf("Введите ширину прямоугольника w = ");
        w = S.nextInt();
        System.out.printf("Введите высоту прямоугольника h = ");
        h = S.nextInt();
        p = 2*(w+h);
        s = w*h;
        System.out.printf("Периметр прямоугольника = %d\nПлощадь прямоугольника = %d",p ,s);

//        Задание 2
//        Написать программу, которая выведет на консоль «Hello world», если пользователь ввел 1,и «Мне нравится язык Java» если пользователь ввел 0»

        int n;
        System.out.printf("\n\nВведите число (1 или 0) ");
        n = S.nextInt();
        if (n==1)
            System.out.printf("Hello world");
        else if (n==0)
            System.out.printf("Мне нравится язык Java");
        else
            System.out.printf("Неверный ввод");

//        ЗАдание 3
//        Ввести 3 целых числа. Вывести максимальное значение
        
        int a, b, c, max = 0;
        System.out.printf("\n\nВведите первое число = ");
        a = S.nextInt();
        System.out.printf("Введите второе число = ");
        b = S.nextInt();
        System.out.printf("Введите третье число = ");
        c = S.nextInt();
        
        if (a>=b && a>=c)
            max = a;
        else if (b>=a && b>=c)
            max = b;
        else if (c>=a && c>=b)
            max = c;

        System.out.printf("Максимально число = %d",max);


    }
}