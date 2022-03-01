import java.util.*;
import java.util.LinkedList;

public class Question4 {
    public static void addAndSort(HashMap<Integer, Integer> hashMap, int value) {
        hashMap.put(hashMap.size(), value);
        
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12));

        for (int i = 0; i < list.size(); i++) {
            hashMap.put(i, list.get(i));
        }
        System.out.println("\nThe HashMap before: " + hashMap);
        
        System.out.println("\nThe HashMap after: ");
        addAndSort(hashMap, 11);
    }
}
