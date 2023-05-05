package Home_work_lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

public class task_3 {
    public static void main(String[] args) {
        
        List<String> listOfplanet1 = new ArrayList<>();
        List<String> listOfplanet2 = new ArrayList<>();

        listOfplanet1.add("Земля");
        listOfplanet1.add("Меркурий");
        listOfplanet1.add("Венера");
        listOfplanet1.add("Венера");
        listOfplanet1.add("Земля");
        listOfplanet1.add("Марс");
        listOfplanet1.add("Юпитер");
        listOfplanet1.add("Сатурн");
        listOfplanet1.add("Уран");
        listOfplanet1.add("Нептун");
        listOfplanet1.add("Девятая планета");
        listOfplanet1.add("Земля");

        Collections.sort(copyList(listOfplanet1, listOfplanet2));
        uniquePlanet(listOfplanet2);

        System.out.println(listOfplanet1);
        System.out.println(listOfplanet2);
        countPlanet(listOfplanet1, listOfplanet2);
    }

    static void countPlanet(List<String> list1, List<String> list2){
        for (int i = 0; i < list2.size(); i++) {
            int count = 0;
            for (int j = 0; j < list1.size(); j++) {
                if (list2.get(i) == list1.get(j)) {
                count ++;
                }
            }
            System.out.println(list2.get(i) + " = " + count);
        }
    }

    static void uniquePlanet(List<String>list){
        for (int i = 0; i < list.size() - 1; i++){
            if(list.get(i) == list.get(i + 1)){
                list.remove(i);
                i--;
            }
        }
    }

    static List<String> copyList(List<String> list1, List<String> list2){
        for (String item: list1) {
            list2.add(item);
        }
        return list2;
    }
}
