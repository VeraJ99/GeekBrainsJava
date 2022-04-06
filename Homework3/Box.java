package Homework3;

import java.util.ArrayList;

public class Box<T extends Fruit >{
    private ArrayList<T> fruitList = new ArrayList<>();

    public Box() {
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                '}';
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight() {
        if(fruitList.size()==0){
            System.out.print ("Коробка пуста - ");
            return 0;

        }
            return fruitList.size() * fruitList.get(0).getFruitWeight();
        }

    public void pourOver(Box<T> box) {
        if (fruitList.size() == 0) {
            System.out.println("Коробка" + box.getFruitList() + " пуста, пересыпать нечего.");
            return;
        }
        box.getFruitList().addAll(fruitList);
        fruitList.clear();
    }

    public boolean compareTo(Box box) {
        boolean tmp = Math.abs(getWeight() - box.getWeight()) < 0.000001;
         //System.out.println("Одинаков ли вес коробок  "+ this +" и "+ box.getFruitList() + "? - " + tmp);
        return tmp;

    }


    }


