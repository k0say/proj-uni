import java.util.*;

public class Collections    {
    public static void main (String[] args) {
        
        String[] things = {"uova", "cazzi", "cose", "cappelli"};
        List<String> list1 = new ArrayList<String>();
        
        //add array items to list
        for(String x : things)
            list1.add(x);
            
        String[] morethings = {"cazzi", "cappelli"};
        List<String> list2 = new ArrayList<String>();
        
        //add array items to list
        for(String y : morethings)
            list2.add(y);
        /*    
        for (int i =0; i< list1.size() ; i++ ) {
            System.out.printf("%s ", list1.get(i));
        }
        
        System.out.println();
        
        for (int i =0; i< list2.size() ; i++ ) {
            System.out.printf("%s ", list2.get(i));
        }
        */
        
        //print out list 1
        System.out.println("List #1 items:\n");
        for (int i =0; i< list1.size() ; i++ ) {
            System.out.printf("%s ", list1.get(i));
        }
        
        editlist(list1,list2);
        System.out.println();
        
        System.out.println("\nList #1 modified:\n");
        for (int i =0; i< list1.size() ; i++ ) {
            System.out.printf("%s ", list1.get(i));
        }
        
    }


    public static void editlist(Collection<String> l1,Collection<String> l2)    {
        Iterator<String> it = l1.iterator();
    
        while(it.hasNext()) {
            if(l2.contains(it.next()))
                it.remove();
        }
    
    }
}
