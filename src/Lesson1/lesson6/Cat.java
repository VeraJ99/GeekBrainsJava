package lesson6;

public class Cat extends Animals {
    public static int countCat = 0;
    public Cat(String type,String name, float maxRun, float maxSwim) {
        super(type,name,maxRun,maxSwim);
        ++ countCat;
    }
}