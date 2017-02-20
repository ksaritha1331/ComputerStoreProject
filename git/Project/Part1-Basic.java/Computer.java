
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

    /**
     * Constructor for objects of class Computer
     */
    public Computer()
    {
        // initialise instance variables
        theProcessor=new Processor();
        theHardDisk=new HardDisk();
        theDisplay=new Display();
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
         theProcessor.getCost();
         
         theHardDisk.display();
         theHardDisk.getCost();
         
         theDisplay.display();
         theDisplay.getCost();
       
    }
}
