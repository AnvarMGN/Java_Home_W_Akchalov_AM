package Home_work_lesson5;
import java.util.*;

// Пусть дан список сотрудников: 
// Иван Иванов, 
// Светлана Петрова, 
// Кристина Белова, 
// Анна Мусина, 
// Анна Крутова, 
// Иван Юрин, 
// Петр Лыков, 
// Павел Чернов, 
// Петр Чернышов, 
// Мария Федорова, 
// Марина Светлова, 
// Мария Савина, 
// Мария Рыкова, 
// Марина Лугова, 
// Анна Владимирова, 
// Иван Мечников, 
// Петр Петин, 
// Иван Ежов.

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности. 
// Для сортировки использовать TreeMap.

public class Task_2 {
    public static void main(String[] args) {

        // List<String> listEmployees1 = new ArrayList<>();
        // List<String> listEmployees2 = new ArrayList<>();
        // listEmployees1.add("Иван Иванов");
        // listEmployees1.add("Светлана Петрова");
        // listEmployees1.add("Кристина Белова");
        // listEmployees1.add("Анна Мусина");
        // listEmployees1.add("Анна Крутова");
        // listEmployees1.add("Петр Лыков");
        // listEmployees1.add("Павел Чернов");
        // listEmployees1.add("Петр Чернышов");
        // listEmployees1.add("Мария Фёдорова");
        // listEmployees1.add("Марина Светлова");
        // listEmployees1.add("Мария Савина");
        // listEmployees1.add("Мария Рыкова");
        // listEmployees1.add("Марина Лугова");
        // listEmployees1.add("Анна Владимирова");
        // listEmployees1.add("Иван Мечников");
        // listEmployees1.add("Петр Петин");
        // listEmployees1.add("Иван Ежов");
        // System.out.println(listEmployees1);

        String[] employees = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

        Map<String, Integer> nameMap = new HashMap<>();
        countName(employees, nameMap);
        System.out.println("HashMap: " + nameMap);

        Map<String, Integer> treeMapName = convertToTreeMap(nameMap);
        System.out.println("TreeMap: " + treeMapName);

        treeMapName
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .forEach(System.out::println);

        // По убыванию

        // treeMapName
        // .entrySet()
        // .stream()
        // .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        // .collect(Collectors.toMap(
        //     Map.Entry::getKey,
        //     Map.Entry::getValue,
        //     (e1, e2) -> e1,
        //     LinkedHashMap::new))
        //     .forEach(System.out::println);
    }

    static void countName(String[] list, Map<String, Integer> map){
        for (String nameLastname : list) {
            String name = nameLastname.split(" ")[0];
            if(map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            } else{
                map.put(name,1);
            }
        }
    }

    static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap){
        Map<K, V> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);
        return treeMap;
    }

}
