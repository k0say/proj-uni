// Java program to demonstrate insertions in TreeSet 
import java.util.*; 
import java.io.*;

public class TreeSetD { 
    
	public static void main(String[] args) 
	{ 
		TreeSet<cliente> ts1 = new TreeSet<cliente>(); 

		// Elements are added using add() method 
		ts1.add(new cliente("A", "gino", "cappuccino", 54)); 
		ts1.add(new cliente("B", "pino", "cappucci", 44)); 
		ts1.add(new cliente("C", "rino", "cappuccin", 4)); 
        
		// Elements get stored in default natural 
		// Sorting Order(Ascending) 
		//cliComp asd = new cliComp();
		//Collections.sort(ts1,asd);
        System.out.println(ts1); 
	} 
} 

class cliente implements Comparable<cliente>{
    String cf;
    String nome;
    String cognome;
    int reddito;
    
    cliente(String cf,String nome, String cognome, int reddito)  {
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
        this.reddito = reddito;
    }
    
    public int compareTo(cliente c){
        return this.reddito - c.reddito;   
    }    
    
    public String toString()    {
        return "CF: "+ this.cf+" nome "+this.nome+" cognome "+ this.cognome+" reddito " + this.reddito;
    }
}

    class cliComp implements Comparator<cliente>   {
        public int compare(cliente c1, cliente c2)  {
            if (c1.reddito < c2.reddito) return -1;
            if (c1.reddito > c2.reddito) return 1;
            else return 0;
            }
    }









