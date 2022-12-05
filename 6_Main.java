import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Создать массив из n чисел
//        Определить, каких чисел больше,  положительных или отрицательных.

        Scanner sc = new Scanner(System.in);
        int n;
        int p = 0, o = 0;

        System.out.printf("Введите размер массива: ");
        n = sc.nextInt();

        if (n>0) {
            int [] arr = new int[n];
            System.out.printf("Введите %d чисел(ла) для заполнения массива: \n",n);
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] >= 0)
                    p++;
                else o++;
            }

            if (p > o)
                System.out.printf("Положительных чисел больше");
            else if (o > p)
                System.out.printf("Отрицательных чисел больше");
            else System.out.printf("Положительных и отрицательных чисел одинаковое количество");
        }
        else
            System.out.printf("Неверная размерность массива");

    }
}