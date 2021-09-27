package lesson3;

public class Homework3 {
    public static void main(String[] args) {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int[] array01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray1("1. Before:\t", array01);
        change(array01);
        System.out.println();
        printArray1("   After:\t", array01);
        System.out.println();
        /*   2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
        int[] array100 = new int[100];
        makeArray(array100);
        System.out.println();
        printArray1("2. Array100: ", array100);
        System.out.println();
        System.out.println();
        /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        int[] arrayTwice = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray1("3. Before:\t", arrayTwice);
        twice(arrayTwice);
        System.out.println();
        printArray1("   After:\t", arrayTwice);
        System.out.println();
        /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        то есть [0][0], [1][1], [2][2], …, [n][n];*/
        int side = 6;
        int[][] arraySquare = new int[side][side];
        cross(arraySquare);
        System.out.println("4. ");
        printArray2("", arraySquare);
        System.out.println();
        /*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
        int[] returnArray = returnArray(5, 33);
        printArray1("5. ", returnArray);
        System.out.println();
        System.out.println();
        /*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
        printArray1("6. Array: \t", arrayTwice);
        System.out.println();
        System.out.println("Min:" + findMin(arrayTwice));
        System.out.println("Max:" + findMax(arrayTwice));
        /*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        Не успеваю(((*/

    }

    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + " ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }

    public static void makeArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }

    public static void twice(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void cross(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }

    }

    public static void printArray2(String msg, int[][] inputArray) {
        System.out.print(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initialValue;
        }
        return tempArray;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static boolean checkBalance (int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
                if (left == right) return true;
                right = 0;
            }
            return false;
        }


    }












