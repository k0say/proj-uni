import java.util.*;
//esercitazione sulle LinkedList
public class linkedlist {
    public static void main (String[] args) {
        
        String[] things = {"apples", "noobs", "pwnge", "bacon", "goats"};
        List<String> list1 = new LinkedList<String>();
        
        //enchanced for loop
        for(String x : things)
            list1.add(x);
        
        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();
        for(String y : things2)
            list2.add(y);
        
        list1.addAll(list2);    //add all elements from list2 to list1, duplicates doesn't count; addAll is a build in method
        list2 = null;   //freed memory
        
        printMe(list1);
        removeStuff(list1, 2,5);
        printMe(list1);
        reverseMe(list1);
    }
    
    //printMe method
    private static void printMe(List<String> l) {
        for(String b : l)
            System.out.printf("%s ", b);
        System.out.println();
    }
    
    //removeStuff method
    private static void removeStuff(List<String> l, int from, int to) {
        //subList is a build in method that create a "new" list, but partial.
        //clear is also a b in method that remove elements
        l.subList(from, to).clear();
    }
    
    //reverseMe
    private static void reverseMe(List<String> l)   {
        //create an iterator, that go throug the list, from the last position
        ListIterator<String> iter = l.listIterator(l.size());
        while(iter.hasPrevious())
            System.out.printf("%s ", iter.previous());
    }
    
}
