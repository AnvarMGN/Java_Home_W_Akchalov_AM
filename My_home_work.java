// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n).

import java.util.Scanner;
/*
public class My_home_work {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        String text_n = iScanner.nextLine();
        int n = Integer.parseInt(text_n);
        iScanner.close();

        double sum = 0;

        while( n != 0){
            sum += 0.5 * n * (n + 1);
            n --;
        }

        System.out.println(sum);
    }
}
*/

//  n! (произведение чисел от 1 до n).
/*
class My_home_work{

    static double factorial( int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args){
    
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите n: ");
        String text_n = iScanner.nextLine();
        int n = Integer.parseInt(text_n);
        iScanner.close();
        
        var resalt = factorial(n);

        System.out.println(resalt);
    }    
}
*/

// 2. Вывести все простые числа от 1 до 1000.
/*
public class My_home_work {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите n(ограничитель): ");
        String text = iScanner.nextLine();
        int n = Integer.parseInt(text);
        iScanner.close();

        int counter = 0;

        for (int i = 2; i < n; i++) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
                counter ++;
            }
            else{
                if (i == 2 || i == 3 || i == 5 || i == 7){
                    System.out.print(i + " ");
                    counter ++;
                }
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел: " + counter);
    }
}
*/
// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить

/*
public class My_home_work {
    static double sum(double a, double b){
        double sum_num = a + b;
        return sum_num;
    }
    static double prod(double a, double b){
        double prod_num = a * b;
        return prod_num;
    }
    public static void main(String[] args) {

        while(true){
            Scanner iScanner = new Scanner(System.in);

            System.out.println("Выберете операцию: 1 - сложение, 2 - умножение, 0 - выход.");
            String text = iScanner.nextLine();
            int command = Integer.parseInt(text);
            
            if (command == 1){
                System.out.print("Введите первое число: ");
                String text_1 = iScanner.nextLine();
                double num_1 = Double.parseDouble(text_1);

                System.out.print("Введите второе число: ");
                String text_2 = iScanner.nextLine();
                double num_2 = Double.parseDouble(text_2);

                double res_sum = sum(num_1, num_2);
                System.out.println(num_1 + " + " + num_2 +" = "+ res_sum);
            }
            if(command == 2){
                System.out.print("Введите первое число: ");
                String text_1 = iScanner.nextLine();
                double num_1 = Double.parseDouble(text_1);

                System.out.print("Введите второе число: ");
                String text_2 = iScanner.nextLine();
                double num_2 = Double.parseDouble(text_2);

                double res_prod = prod(num_1, num_2);
                System.out.println(num_1 + " * " + num_2 +" = "+ res_prod);
            }
            if(command == 0){
                System.out.println("Выход.");
                break;
            }
        }
        
    }
}
*/

// Task_6
// Вводится массив (сначала количество элементов, потом сами элементы). 
// Найдите сумму его элементов с чётными индексами и выведите её. 
// А потом выведите числа, которые суммировались.

// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3

/* 
class MyProgram{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        String text = sc.nextLine();
        int size = Integer.parseInt(text);
    
        int[] my_array = new int[size];
        int sum_num = 0;
    
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива: ");
            my_array[i] = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0){
                sum_num += my_array[i];
            }
        }
        System.out.println("Сумма чётных элементов равна: " + sum_num);
        for (int i = 0; i< size; i+= 2) {
            System.out.println(my_array[i]);
        }
    }
}
*/