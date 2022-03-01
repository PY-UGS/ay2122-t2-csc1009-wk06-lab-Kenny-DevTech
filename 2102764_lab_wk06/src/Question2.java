import java.util.*;
import java.util.LinkedList;  

public class Question2 {
    public static void swapValues (LinkedList<Integer> list, int indexOne, int indexTwo) {
        int tempHolder = list.get(indexTwo);
        list.set(indexTwo, list.get(indexOne));
        list.set(indexOne, tempHolder);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(2,4,6,8,10,12));
        System.out.println("The list before: "+list);
        swapValues(list, 1,5);
        System.out.println("The list after: "+list);
    }
}
