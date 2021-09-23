package Lesson2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("task1:" + sumSign(5, 20));


        positiveNegative(5);
        positNeg(-7);
        printStringNTimes("Example", 3);
    }
    /*1. Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.*/

    public static boolean sumSign(int a, int b) {
        return (10 < a + b && a + b < 20);
    }

    /*2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или
    отрицательное. Замечание: ноль считаем положительным числом.*/
    public static void positiveNegative(int a) {

        if (a >= 0) {
            System.out.println(a + " positive");
        } else {
            System.out.println(a + " negative");
        }
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static void positNeg(int a) {
        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /*4. Написать метод, которому в качестве аргументов передается строка и число,
     метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void printStringNTimes(String text, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ":" + text);
        }


    }

}