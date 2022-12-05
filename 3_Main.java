import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задание 1. Создать метод, который рассчитывает сумму между 2мя числами, например, при передаче двух параметров
//        2 и 9, суммируются числа 2+3+4+5+6+7+8+9 и возвращается с помощью return программе и вывести результат на экран
        Scanner S = new Scanner(System.in);
        int a, b, res;
        System.out.printf("\nВведите два числа для подсчета суммы между ними(включительно)");
        System.out.printf("\nВведите первое число - ");
        a = S.nextInt();
        System.out.printf("Введите второе число - ");
        b = S.nextInt();

        if (a<b)
            res = sum(a, b);
        else if (b<a)
            res = sum(b, a);
        else res = a;
        System.out.printf("Сумма чисел равна %d",res);

//        Задание 2. Создать метод для вычисления суммы или произведения 2х чисел.
//        В метод передаются числа a и b и знак операции, + или *
        System.out.printf("\n------------------------\nВычисление суммы или произведения 2х чисел.");
        System.out.printf("\nВведите первое число - ");
        a = S.nextInt();
        System.out.printf("Введите второе число - ");
        b = S.nextInt();
        System.out.printf("Введите знак + или * - ");
        char c = S.next().charAt(0);
        res=calc(a, b, c);
        System.out.printf("Ваш результат = %d",res);

    }

    static int sum(int a, int b) {
        int sum = 0;
             for(int i=a; i<=b; i++) {
                sum += i;
             }
        return sum;
    }

    static int calc(int a, int b, char c){
        int res = 0;
        if (c=='+')
            res = a+b;
        else if (c=='*')
            res = a*b;
        return res;
    }

}