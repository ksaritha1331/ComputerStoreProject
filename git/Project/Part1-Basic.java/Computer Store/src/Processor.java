

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
    public Processor()
    {
        // initialise instance variables
       
    }
    
    
   public void display()
   { 
       
       System.out.println("#############################");
       System.out.println("Processor Brand :" +brand);
       System.out.println("Thermal Design Power: " +  thermalDesignPower);
       System.out.println("Graphics Controller: " + graphicsController) ;
       System.out.println("Clock Speed: " + clockSpeed);
       System.out.println("Processor Socket:" + processorSocket);
       System.out.println("Cache:"  + cache );
       System.out.println("Total Cost : " + totalCost);
       
       System.out.println("#############################");
   }
   public void setCost(int cost)
    {
        // put your code here
       totalCost=cost;
    }
    
    public void setBrand(String brand)
    {
        // put your code here
       this.brand=brand;
    }
    
    public void setprocessorCores(int processCore)
    {
        // put your code here
       processorCores=processCore;
    }
    public void setThermalDesignPower(String thermalPower)
    {   
        // put your code here
       thermalDesignPower=thermalPower;
    }
    public void setGraphicController(String graphicsController)
    {
        // put your code here
       this.graphicsController=graphicsController;
    }
    public void setClockSpeed(String clockSpeed)
    {
        // put your code here
       this.clockSpeed=clockSpeed;
    }
    public void setprocessorSocket(String processorSocket)
    {
        // put your code here
       this.processorSocket=processorSocket;
    }
    public void setcache(String cache)
    {
        // put your code here
       this.cache=cache;
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
    public String getThermalDesignPower()
    {
        // put your code here
       return thermalDesignPower;
    }
    public String getGraphicsController()
    {
        // put your code here
       return graphicsController;
    }
    public String getCache()
    {
        // put your code here
       return cache;
    }
    
}
