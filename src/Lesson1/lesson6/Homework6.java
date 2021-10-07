package lesson6;

public class Homework6 {
    public static void main(String[] args){
        Cat cat1 = new Cat("Cat","Murysa",200,0);
        Cat cat2 = new Cat("Cat", "Fedor", 175, 0);
        Dog dog1 = new Dog ("Dog","Jack", 500, 50);
        Dog dog2 = new Dog("Dog", "Grey", 700, 30);

        Animals[]Animals = {cat1, cat2, dog1, dog2};

        System.out.println(cat1.getname());
        System.out.println(dog1.getFullInfo());
        System.out.println(cat1.getMaxRun());
        System.out.println(cat1.getMaxSwim());
        System.out.println(cat1.run(150));
        System.out.println(dog1.swim(100));

        System.out.println(cat1.name + cat1.showResultRun(150));
        System.out.println(cat1.name + cat1.showResultSwim(100));
}



}
