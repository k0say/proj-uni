import java.util.*;
public class collectionSort   {
    public static void main (String[] args) {
        
        String[] crap = {"apples", "merda", "lemons", "bacon", "utube", "more"};
        //lets convert into a list
        List<String> lcrap = Arrays.asList(crap);
        
        //Collections has a lot of methods, but needs to convert into a list
        Collections.sort(lcrap);
        System.out.printf("%s\n", lcrap);
        
        //since this is an overload method, we can add a 2nd parameter, so this method is gonna 
        //check the second param and to stuff; in this case reverse
        Collections.sort(lcrap, Collections.reverseOrder());
        System.out.printf("%s\n", lcrap);
    }
}
