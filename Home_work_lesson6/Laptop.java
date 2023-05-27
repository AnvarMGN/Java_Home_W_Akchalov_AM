package Home_work_lesson6;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Laptop {
    private String firm;
    private String model;
    private String os;
    private String color;
    private int ramMemory;
    private int hardDiskCapacity;

    public Laptop(String firm, String model, String os, String color, 
    int ramMemory, int hardDiskCapacity){
    this.firm = firm;
    this.model = model;
    this.os = os;
    this.color = color;
    this.ramMemory = ramMemory;
    this.hardDiskCapacity = hardDiskCapacity;
    }

    public String getFirm(){ return firm;}
    public String getModel(){return model;}
    public String getOs(){return os;}
    public String getColor(){return color;}
    public int getRamMemory(){return ramMemory;}
    public int getHardDiskCapacity(){return hardDiskCapacity;}

    public void setFirm(String firm){this.firm = firm;}
    public void setModel(String model){this.model = model;}
    public void setOs(String os){this.os = os;}
    public void setColor(String color){this.color = color;}
    public void setRamMemory(int ramMemory){this.ramMemory = ramMemory;}
    public void setHardDiskCapacity(int hardDiskCapacity){this.hardDiskCapacity = hardDiskCapacity;}

    @Override
    public String toString(){
        return "Производитель: " + firm + ", Модель: " + model + ", ОС: "  + os + ", Цвет: " + color + ", ОЗУ(Гб): " + ramMemory + ", Объём ЖД: " + hardDiskCapacity + "\n";
    }
    
    // поиск ноутбука по нескольким критериям
    public List<Laptop> filter(Set<Laptop> laptop) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте!" + 
            "\nВведите параметры ноутбука." +
            "\nУкажите объём жёсткого диска(Гб):\n256, 512, 1024.");
        String inputHDD = sc.nextLine();
        int parseHDD = Integer.parseInt(inputHDD);
        System.out.println("Укажите объём оперативной памяти(Гб):\n8, 16, 32.");
        String inputRAM = sc.nextLine();
        int parseRAM = Integer.parseInt(inputRAM);
        System.out.println("Укажите операционную систему:\nnon, macOS, Windows 11.");
        String inputOS = sc.nextLine();
        System.out.println("Укажите цвет ноутбука:\nBlack, Gray, White.");
        String inputColor = sc.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();

        for (Laptop tempLaptop : laptop) {
            if (parseHDD == tempLaptop.hardDiskCapacity) {
                if (parseRAM == tempLaptop.ramMemory) {
                    if (inputOS.equals(tempLaptop.os)) {
                        if (inputColor.equals(tempLaptop.color)) {
                            listLaptop.add(tempLaptop);
                        }
                    }
                }
            }
        }
        sc.close();
        return listLaptop;
    }
    
    // поиск ноутбука по одному критерию
    public Set<Laptop> filter1(Set<Laptop> laptop) {
        Scanner sc = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Укажите интересующий параметр ноутбука: " + 
        "\n1. Объём жёсткого диска\n2. Объём оперативной памяти\n3. Операционная система\n4. Цвет");
        String customerRequest = sc.nextLine();
            
        for (int i = 0; i < customerRequest.length(); i++) {
            if(1 == Character.getNumericValue(customerRequest.charAt(i))) {
                System.out.println("Укажите объём жёсткого диска(Гб):\n256, 512, 1024.");
                String inputHDD = sc.nextLine();
                int parseHDD = Integer.parseInt(inputHDD);
                for (Laptop tempLaptop : laptop) {
                    if (parseHDD != tempLaptop.hardDiskCapacity){ 
                        listLaptop.remove(tempLaptop);
                    }
                }          
            }
            
            if(2 == Character.getNumericValue(customerRequest.charAt(i))){
                System.out.println("Укажите объём оперативной памяти(Гб):\n8, 16, 32.");
                String inputRAM = sc.nextLine();
                int parseRAM = Integer.parseInt(inputRAM);
                for (Laptop tempLaptop : laptop) {
                    if ((parseRAM == (tempLaptop.ramMemory)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }   

            if(3 == Character.getNumericValue(customerRequest.charAt(i))){
                System.out.println("Укажите операционную систему:\nnon, macOS, Windows 11.");
                String inputOS = sc.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((inputOS.equals(tempLaptop.os) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        
            if(4 == Character.getNumericValue(customerRequest.charAt(i))){
                System.out.println("Укажите цвет ноутбука:\nBlack, Gray, White.");
                String inputColor = sc.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((inputColor.equals(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        sc.close();
        return listLaptop;
    }

    // конструктор для вызова метода
    public Laptop() {
    }
}
    