package lesson6;

public class Dog extends Animals{
    public static int countDog = 0;
    public Dog(String type, String name, float maxRun, float maxSwim) {
        super(type,name,maxRun,maxSwim);
        ++ countDog;
    }
}
