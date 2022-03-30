package Homework2;

public class ArrayExeption {
    public static void main(String[] args)  {
        String[][]testArray= {{"1","2","3","4"},{"9","8","k","6"},{"1","2","3","4"},{"9","8","7","6"}};


        try {
            System.out.println(sumArray(testArray));
        } catch (MyArraySiseException e) {
            e.printStackTrace();
        } catch (MyArrayDataExeption e) {
            e.printStackTrace();
       }


    }

    public static int sumArray(String[][] my4x4Array) throws MyArraySiseException, MyArrayDataExeption {
        if (my4x4Array.length != 4) {
            throw new MyArraySiseException("!!!Длина массива не равна 4!!!");

        }
        for (String[] arrayLevel : my4x4Array) {
            if (arrayLevel.length != 4) {
                throw new MyArraySiseException("!!!Высота массива не равна 4!!!");
            }
        }

        int sum = 0;
        for (int i = 0; i < my4x4Array.length; i++) {
            for (int j = 0; j < my4x4Array[i].length; j++) {
                try {
                    sum += Integer.parseInt(my4x4Array[i][j]);
                } catch (NumberFormatException e) {
                   throw new MyArrayDataExeption("Массив содержит не число!: [" + i + ";" + j +"]");

                }
            }
        }
        return sum;

    }
}