// Задача 2
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < random.nextInt(1, 10); i++) {
            list.add(random.nextInt(-10, 10));
        }
        ArrayList<Integer> copy_list = new ArrayList<Integer>();
        copy_list.addAll(0, list);
        System.out.printf("Список целых чисел имеет вид:\n%s\n", copy_list);
        for (Integer item : copy_list) {
            if (item % 2 == 0)
                list.remove(item);
        }
        System.out.printf("Список без четных чисел:\n%s", list);
    }
}