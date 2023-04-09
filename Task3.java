
// Задача 3
// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < random.nextInt(1, 10); i++) {
            list.add(random.nextInt(-10, 10));
        }
        System.out.printf("Массив целых чисел имеет вид:\n%s\n", list);
        list.sort(null);
        int min = list.get(0);
        int max = list.get(list.size() - 1);
        double sum = 0;
        for (Integer item : list) 
            sum += item;
        double average = sum / list.size();
        System.out.printf("Минимальный элемент списка равен:\n%s\n", min);
        System.out.printf("Максимальный элемент списка равен:\n%s\n", max);
        System.out.printf("Среднеарифметическое списка равно:\n%s", average);
    }
}