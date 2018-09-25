import java.util.*;

public class Employee //implements Comparable<Employee>   {
{
    private int id;
    private String name;
    private long salary;
    
    public int getId()  {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public long getSalary() {
        return salary;
    } 
    
    public Employee(int id, String name, int salary)    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
 //   public int compareTo(Employee emp)  {
   //     return (this.id - emp.id);
    //}
    
/**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
    }
    
    public static void main (String[] args) {
                
        //sorting object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 10000);
        empArr[1] = new Employee(20, "Arun", 20000);
        empArr[2] = new Employee(5, "Lisa", 5000);
        empArr[3] = new Employee(1, "Pankaj", 50000);
        
        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));

        
        //sorting employees array using Comparable interface implementation
//        Arrays.sort(empArr);
  //      System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr)+"\n");

    }
    
    
}
