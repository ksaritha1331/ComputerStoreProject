
/**
 * Computer-Store-Stores the details of the components.
 * @author Saritha
 * @version 0.1
 */
public class Computer
{
    // instance variables - replace the example below with your own
    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Display theDisplay;
    private int total;
   

    /**
     * Constructor for objects of class Computer
     */
    public Computer()
    {
        // init ialise instance variables
       
    }
    
    public void addProcessor(Processor details)
    {
         theProcessor=details;
    }
    public void addHardDisk(HardDisk details)
    {
         theHardDisk=details;
    }
    public void addDisplay(Display details)
    {
         theDisplay=details;
    }
    /**
     * print a summary of the Computer components and calculate the total cost
     * @param      a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printComputerSummary() 
    // method calls to get info about the other components
    {  
                 theProcessor.display();
                 theHardDisk.display();
                 theDisplay.display();
                 
                 total=theProcessor.getCost()+theHardDisk.getCost()+theDisplay.getCost();
                 System.out.println("The total coust of the computer components is :" + total);
    }
    public int getTotal()
    {  
       return total;
     }   
       
}
