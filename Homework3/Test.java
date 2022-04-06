package Homework3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println(arrayList);
        arrayList.add(1, "А0");
        System.out.println(arrayList);
        arrayList.remove("E");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
    }

}
