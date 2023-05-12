package Home_work_lesson4;

import java.util.LinkedList;
import java.util.ListIterator;

/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам. */

public class Task_1 {
    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);
        reversList(myList);
    }

    static LinkedList<Integer> reversList(LinkedList<Integer> list){

        ListIterator<Integer> myIterator = list.listIterator(list.size());

        while (myIterator.hasPrevious()) {
            System.out.println(myIterator.previous());
        }

        return list;
    }
}
