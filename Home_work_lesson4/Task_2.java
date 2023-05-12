package Home_work_lesson4;

import java.util.LinkedList;
import java.util.Queue;

/*Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

public class Task_2 {
    public static void main(String[] args) {
        
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);

        System.out.println(myQueue);
        
        enqueue(myQueue, 11);
        System.out.println(myQueue);

        System.out.println(dequeue(myQueue));
        System.out.println(myQueue);

        System.out.println(first(myQueue));
        System.out.println(myQueue);
    }

    static void enqueue(Queue<Integer> queue, int num){
        queue.offer(num);
        /*Как я понял, работая с LinkedList и используя интерфейс - очередь Queue, 
        методы add и offer всегда будут добавлять элементы в конец очереди.
        Логично, ведь это методы Queue.
        Получаетя используя оченредь, мы не можем использовать функционал LinkedList? 
        */

        /*А решая задание со звёздочкой, мы создаём отдельный класс, наполняя
         * его нужными нам методами, под капотом у которых массив.
         * Получается используем LinkedList, а функционал массива.
         * LinkedList это как структура, которую можно по разному использовать.
         * Не могу прийти к конкретному выводу...
         */
    }

    static Integer dequeue(Queue<Integer> queue){
        return queue.poll();
    }

    static Integer first(Queue<Integer> queue){
        return queue.peek();
    }
}
