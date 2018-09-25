import java.util.*;

public class genericTest	{
  public static void main(String[] args)	{
    Integer[] iarr = {1,2,3,4,5};
    Character[] carr = {'g','i','a','n','n','i'};
    
    printMe(iarr);
    printMe(carr);
  }
  /*
  public static void printMe(Integer[] i)	{
    for(Integer x : i)
      System.out.printf("%s ", x);
    System.out.println();
  }
  
  public static void printMe(Character[] i)	{
    for(Character x : i)
      System.out.printf("%s ", x);
    System.out.println();
  }
*/
  // generic method
  public static <T> void printMe(T[] x)	{
  	for(T b : x)
      System.out.printf("%s ", b);
    System.out.println();
  }
  
}
