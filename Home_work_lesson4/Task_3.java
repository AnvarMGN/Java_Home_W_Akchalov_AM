package Home_work_lesson4;

import java.util.LinkedList;
import java.util.ListIterator;

/*Найдите сумму всех элементов LinkedList, 
сохраняя все элементы в списке. Используйте итератор. */

public class Task_3 {
    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(4);
        myList.add(7);
        myList.add(14);

        System.out.println(myList);
        System.out.println(sumElements(myList));
    }

    static Integer sumElements(LinkedList<Integer> list){

        ListIterator<Integer> myIterator = list.listIterator();
        Integer sumNum = 0;

        while(myIterator.hasNext()){
            //Integer num = myIterator.next();
            sumNum += myIterator.next();
        }
        return sumNum;
    }
}
