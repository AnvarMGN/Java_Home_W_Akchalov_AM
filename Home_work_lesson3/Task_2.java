package Home_work_lesson3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка. 
// Collections.max()

public class Task_2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);

        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(arithmeticMean(list));
    }
    static Double arithmeticMean(List<Integer> list){

        double sumElements = 0;

        for (int i = 0; i < list.size(); i++){
            sumElements += list.get(i);
        }

        double avMean = sumElements / list.size();

        return avMean;
    }
}