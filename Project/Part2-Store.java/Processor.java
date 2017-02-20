
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{
    // instance variables - replace the example below with your own
    private int totalCost;
    private int processorCores;
    private String brand;
    private String thermalDesignPower;
    private String graphicsController;
    private String clockSpeed;
    private String processorSocket;
    private String cache;

    /**
     * Constructor for objects of class Processor
     */
   /* public Processor(String brand, int processCore, String thermalPower,String graphicsController,String clockSpeed,String processorSocket,String cache,int cost)
    {
        // initialise instance variables
        setDetails(brand,processCore,thermalPower,graphicsController,clockSpeed,processorSocket,cache,cost);
    }*/
   public Processor()
   { 
     
   }
    
   public void display()
   { 
       
       System.out.println("#############################");
       System.out.println("Processor Brand : " + brand );
       System.out.println("Processor Cores: " + processorCores);
       System.out.println("Clock Speed: " + clockSpeed );
       System.out.println("Processor Socket: " + processorSocket );
       System.out.println("Total Cost : " + totalCost);
       
       System.out.println("#############################");
   }
   public void setDetails(String brand, int processCore,String clockSpeed,String processorSocket,String cache,int cost)
    {
        this.brand=brand;
        this.processorCores=processCore;
        this.clockSpeed=clockSpeed;
        this.processorSocket=processorSocket;
        this.totalCost=cost;
    }
    
   
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getCost()
    {
        // put your code here
       return totalCost;
    }
    public String getClockSpeed()
    {
        // put your code here
       return clockSpeed;
    }
    public int getprocessorCores()
    {
        // put your code here
       return processorCores;
    }
    
    public String getprocessorSocket()
    {
        // put your code here
       return processorSocket;
    }
     public String getBrand()
    {
        // put your code here
       return brand;
    }
    
}
