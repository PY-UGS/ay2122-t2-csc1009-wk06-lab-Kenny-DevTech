import java.util.*;
import java.util.LinkedList;  

public class Question5 {
    public static void swapValues (HashMap<Integer, Integer> hashMap, int indexOne, int indexTwo) {
        int tempHolder = hashMap.get(indexTwo);
        hashMap.put(indexTwo, hashMap.get(indexOne));
        hashMap.put(indexOne, tempHolder);
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(2,4,6,8,10,12));
        
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(i, list.get(i));
        }

        System.out.println("The HashMap before: "+hashMap);
        swapValues(hashMap, 1,5);
        System.out.println("The HashMap after: "+hashMap);
    }
}
