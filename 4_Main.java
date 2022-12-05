import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Создать две коллекции для хранения информации
//        о студенте (фамилия и оценка)
//
//        1 Фамилии студентов  (коллекция 1)
//        2 Оценка на экзамене (коллекция 2)
//
//        Ввести с клавиатуры информацию о 10 студентах
//
//        Вывести не экран студентов,  у которых оценка 4 или 5

        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<Integer> score = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.println("Введите фамилию студента: ");
            lastName.add(sc.next());
            System.out.println("Оценка на экзамене: ");
            score.add(sc.nextInt());
        }

        for (int i=0; i<score.size(); i++){
            if (score.get(i)>3 && score.get(i)<=5){
                System.out.println(lastName.get(i)+"\t"+score.get(i));
            }
        }

    }
}