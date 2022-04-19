package Homework4;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

public class Main  {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("cat", "dog", "fox", "bird", "bird", "bird", "cat", "dog", "cat",
                "dog", "cat", "dog", "bird", "bird", "bird", "cat"));

        System.out.println(stringArrayList);
        System.out.println("cat".hashCode());
        System.out.println("dog".hashCode());
        System.out.println("bird".hashCode());


        int count = 0;
        for (String word : stringArrayList) {
            count++;
        }
        System.out.println("Всего слов в списке: " + count + ".");

        HashSet<String> stringHashSet = new HashSet<>(stringArrayList);
        System.out.println("Уникальные слова: " + stringHashSet);


        HashMap<String, Integer> uniqueWords = new HashMap<>();


        for (int i = 0; i < stringArrayList.size(); i++) {
            if (uniqueWords.containsKey(stringArrayList.get(i))) {
                uniqueWords.put(stringArrayList.get(i), uniqueWords.get(stringArrayList.get(i)) + 1);
            } else {
                uniqueWords.put(stringArrayList.get(i), 1);
            }
        }


        System.out.println(uniqueWords);

Iterator<Map.Entry<String, Integer>> iterator = uniqueWords.entrySet().iterator();
while (iterator.hasNext()) {

    Integer value = iterator.next().getValue();
    System.out.print(value + ", ");

}

        Set<Map.Entry<String, Integer>> entrySet = uniqueWords.entrySet();


    System.out.println();

        ArrayList<Map.Entry<String, Integer>> entryArrayList = new ArrayList<>(entrySet);
        Collections.sort(entryArrayList, new AnimalCountComparator() );
        System.out.println(entryArrayList);



       /* int countCat = 0;
        for(String word : stringArrayList){
            if(word.equals("cat"))
            countCat++;
        }
        System.out.println( "Слово 'cat' встречается в списке " + countCat + " раз.");

        int countDog = 0;
        for(String word : stringArrayList){
            if(word.equals("dog"))
                countDog++;
        }
        System.out.println( "Слово 'dog' встречается в списке " + countDog + " раз.");


        int countBird = 0;
        for(String word : stringArrayList){
            if(word.equals("bird"))
                countBird++;
        }
        System.out.println( "Слово 'bird' встречается в списке " + countBird + " раз.");

        int countFox = 0;
        for(String word : stringArrayList){
            if(word.equals("fox"))
                countFox++;
        }
        System.out.println( "Слово 'fox' встречается в списке " + countFox + " раз.");


        }
*/

    }

    }





