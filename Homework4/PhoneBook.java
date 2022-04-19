package Homework4;

import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBookMap = new HashMap<>();

    public HashMap<String, ArrayList<String>> getPhoneBookMap() {
        return phoneBookMap;
    }

    public void setPhoneBookMap(HashMap<String, ArrayList<String>> phoneBook) {
        this.phoneBookMap = phoneBookMap;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookMap=" + phoneBookMap +
                '}';
    }

    public void add(String lastName, String phoneNamber){
        ArrayList<String> phonesForLastname = phoneBookMap.getOrDefault(lastName, new ArrayList<>());
        phonesForLastname.add(phoneNamber);
        phoneBookMap.put(lastName,phonesForLastname);
    }
    public ArrayList<String>get(String lastName){
        return phoneBookMap.get(lastName);
    }

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov","1236789");
        phoneBook.add("Smirnov","1235540");
        phoneBook.add("Popov","1234242");
        phoneBook.add("Petrov","1236190");
        phoneBook.add("Gerasimov","1232232");
        phoneBook.add("Morozov", "1237777");

        System.out.println("Petrov" + phoneBook.get("Petrov"));
        System.out.println("Ivanov" + phoneBook.get("Ivanov"));

       System.out.println(phoneBook.getPhoneBookMap().entrySet());
       System.out.println(phoneBook.getPhoneBookMap().keySet());
       System.out.println(phoneBook.getPhoneBookMap().values());



        phoneBook.add("Volkov", "1239312");
        phoneBook.add("Zaytsev","1234778");
        phoneBook.add("Ivanov","1232914");

        System.out.println(phoneBook.getPhoneBookMap().values());

        System.out.println("Ivanov" + phoneBook.get("Ivanov"));
        System.out.println(phoneBook.phoneBookMap);

        Set<Map.Entry<String, ArrayList<String>>> entrySet = phoneBook.getPhoneBookMap().entrySet();
        Iterator<Map.Entry<String, ArrayList<String>>>iterator = entrySet.iterator();
    while (iterator.hasNext()) {
    String key = iterator.next().getKey();
    System.out.print(key+ ", ");
    if (key.equals("Ivanov")) {
        iterator.remove();
    }
}
        System.out.println();
        System.out.println(phoneBook.phoneBookMap);

    }

}
