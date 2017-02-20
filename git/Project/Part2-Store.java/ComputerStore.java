import java.util.ArrayList;

/**
 * Write a description of class ComputerStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ComputerStore
{
    // instance variables - replace the example below with your own
    private ArrayList<Computer> computers;

    public ComputerStore()
    {
        // initialise instance variables
      computers=new ArrayList<>();
      
    }

    public boolean addComputer(Computer newComputer) 
    {
        // put your code here
      computers.add(newComputer);
      return true;
    }
    
    public boolean removeComputer(int index) { 
        if (index>=0 &&index<computers.size())
        { 
        computers.remove(index);
        return true;
        } 
        return false;    
    } 
    
    public void printAllComputers( ) {
    // prints out all the details of each computer in store
    for(int i=0;i<computers.size();i++)
    {
        System.out.println(computers.get(i));
    }
 
   }
   
   public void printTotalValue( ) {
    // prints the total cost for all computers
    int total=0;
    for (Computer comp:computers)
    {
        total+=comp.getTotal();
       
    }   
     System.out.println("The total cost for all the computers" + total );
   }
}
