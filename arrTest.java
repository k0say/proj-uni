import java.util.*;
public class java   {
    public static void main (String[] args) {
        
        String[] stuff = {"babies", "watermelon", "melons", "fudge" };
        //using (Arrays.asList(param)) treat the array "stuff", which is an array, as a list -> thelist
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
        
        //infact these is a linkedlist method
        //------------
        //add -> add the element to the end
        thelist.add("pumpking");
        //addFirst is a b in method that ovviamente add as first
        thelist.addFirst("firstthing");
        
        //convert back to an array
        stuff = thelist.toArray(new String[thelist.size()]);
        
        for(String x : stuff)
            System.out.printf("%s ", x);
    }
}
