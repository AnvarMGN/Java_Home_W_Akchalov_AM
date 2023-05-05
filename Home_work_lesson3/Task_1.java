package Home_work_lesson3;

import java.util.List;
import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него четные числа.

public class Task_1 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(10);
        list.add(4);
        list.add(222);
        list.add(1);
        System.out.println(list);
        removeEvenNum(list);
        System.out.println(list);
    }

    static void removeEvenNum(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }

}


