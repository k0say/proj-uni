import java.util.*;
public class compare    {
    public static void main (String[] args) {
        System.out.println(max(23,48,1));
        System.out.println(max("gino","zntonio","mimmmmmmmo"));
    }
    
    public static <T extends Comparable<T>> T max(T a, T b, T c)    {
        T massimo = a;
        
        if(b.compareTo(a) > 0)
            massimo = b;
            
        if(c.compareTo(massimo) > 0)
            massimo = c;
            
        return massimo;
    }
}
