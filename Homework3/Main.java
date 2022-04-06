package Homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple();
        System.out.println("Вес одного яблока: " + apple.getFruitWeight());
        Orange orange = new Orange();
        System.out.println("Вес одного апельсина: " + orange.getFruitWeight());
        System.out.println("*********************************");

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Содержание коробки appleBox: " + appleBox.getFruitList());
        System.out.println("Вес коробки appleBox  : " + appleBox.getWeight());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println("Содержание коробки appleBox2: " + appleBox2.getFruitList());
        System.out.println("Вес коробки с фруктами appleBox2  : " + appleBox2.getWeight());

        appleBox2.compareTo(appleBox);
        System.out.println("Одинаков ли вес коробок appleBox2 и appleBox? - " + appleBox2.compareTo(appleBox));
        System.out.println("*********************************");

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println("Содержание коробки orangeBox: " + orangeBox.getFruitList());
        System.out.println("Вес коробки orangeBox  : " + orangeBox.getWeight());


        appleBox.compareTo(orangeBox);
        System.out.println("Одинаков ли вес коробок appleBox и orangeBox? - " + appleBox.compareTo(orangeBox));
        System.out.println("*********************************");

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        System.out.println("Содержание коробки orangeBox1: " + orangeBox1.getFruitList());
        System.out.println("Вес коробки orangeBox1  : " + orangeBox1.getWeight());
        System.out.println("*********************************");

        System.out.println("Пересыпать фрукты из appleBox в appleBox2");

        appleBox.pourOver(appleBox2);
        System.out.println("В результате в appleBox: " + appleBox.getFruitList());
        System.out.println("В результате в appleBox2: " + appleBox2.getFruitList());

        System.out.println("Пересыпать фрукты из orangeBox1 в orangeBox");
        orangeBox1.pourOver(orangeBox);
        System.out.println("В результате в orangeBox1: " + orangeBox1.getFruitList());
        System.out.println("В результате в orangeBox: " + orangeBox.getFruitList());
        System.out.println(" ");
        orangeBox1.pourOver(orangeBox1);
        System.out.println(orangeBox1.getWeight());
       

        System.out.println("*********************************");
        System.out.println(" ");

        System.out.print("Исходный массив: ");
        Object[] objectsArray = new Object[]{"object1", "object2", "object3", "object4"};
        System.out.print(Arrays.toString(objectsArray));

        System.out.println(" ");
        System.out.print("Измененный массив: ");
        changeArrElements(objectsArray, 2, 3);
        System.out.print(Arrays.toString(objectsArray));

        System.out.println(" ");
        System.out.print("Переизмененный массив: ");
        changeArrElements(objectsArray, 0, 3);
        System.out.print(Arrays.toString(objectsArray));


    }


    public static void changeArrElements(Object[] array, int indexA, int indexB) {
        Object tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }
}


