import java.util.*;

public class methodsFill   {
    public static void main (String[] args) {
        
        //create an array and convert to a list
        //String[] arr = {"ciao", "minchia", "bacon", "more", "siga", "urlo"};
        Character[] arr = {'p', 'w', 'n'};
        List<Character> l = Arrays.asList(arr);
        
        System.out.println("List is: ");
        output(l);
        
        //reverse and print out the list
        Collections.reverse(l);
        System.out.println("After reverse: ");
        output(l);
        
        //copy method, for lists
        //first make a nu array, then a list from there
        Character[] newarr = new Character[3];
        List<Character> listcopy = Arrays.asList(newarr); //empty list, size 3
        //copy takes 2 param -> from where, where to
        Collections.copy(listcopy, l);
        System.out.println("Copy of list: ");
        output(listcopy);
        
        //fill collection with crap
        //fill -> 1st param LIST, 2nd param WITH WHAT?
        Collections.fill(l, 'X');
        System.out.println("After filling the list: ");
        output(l);
    }
    
    private static void output(List<Character> l)    {
        for(Character z: l)
            System.out.printf("%s ", z);
        
        System.out.println();
    }
    
}
