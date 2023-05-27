package Home_work_lesson6;

/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
 * Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

Работу сдать как обычно ссылкой на гит репозиторий

P.S. Частые ошибки смотри в конце семинара
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Apple", "MacBook Pro 14", "macOS", 
        "Gray", 16, 512);
        Laptop laptop2 = new Laptop("Acer", "Nitro 5 AN515-57 NH.QELER.00C", 
        "non", "Black", 32, 1024);
        Laptop laptop3 = new Laptop("HUAWEI ", "53013ERR BoD-WDH9 MateBook D15",
         "Windows 11", "Black", 8, 512);
        Laptop laptop4 = new Laptop("Lenovo ", "IdeaPad 3 15ITL05 81X800MCUS", 
        "Windows 11", "White", 8, 256);
        Laptop laptop5 = new Laptop("MSI", "Pulse GL66 12UEK-289XRU", 
        "non", "Gray", 16, 512);
        
        Set<Laptop> laptops = new HashSet<>(
            Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));
        
        Laptop findLaptop = new Laptop();

        System.out.println("Результат: " + findLaptop.filter(laptops));// по нескольким критериям
        //System.out.println("Результат: " + (findLaptop.filter1(laptops));// по одному критерию
    }
}
