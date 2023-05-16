package Home_work_lesson5;
import java.util.*;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов. 
 * Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге
 */

public class Task_1{
    public static void main(String[] args) {

        Map<String, List<Integer>> phoneBook = new HashMap<>();

        addContact("Иванов", 123456, phoneBook);
        addContact("Иванов", 12345, phoneBook);
        addContact("Сидоров", 654123, phoneBook);
        addContact("Сидоров", 654321, phoneBook);
        addContact("Лавров", 1234567, phoneBook);
        addContact("Лавров", 123, phoneBook);
        printContact(phoneBook);
    }
    
       
    static void addContact(String key, int value, Map<String, List<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    static void printContact(Map<String, List<Integer>> map){
        for (var item : map.entrySet()) {
            String line = "";
            for(int num: item.getValue()){
                line = line + num + " ";
            }
            System.out.printf("%s: %s \n", item.getKey(), line);
        }
    }
}
