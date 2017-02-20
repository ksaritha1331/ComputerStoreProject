
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display
{
    // instance variables - replace the example below with your own
    private String display;
    private int refreshRate;
    private String resolution;
    private String responseTime;
    private int screenSize;
    private int totalCost;
    /**
     * Constructor for objects of class Display
     */
    public Display()
    {
        // initialise instance variables

    }
   public void display()
   { 
       
       System.out.println("#############################");
       System.out.println("Display : ");
       System.out.println("Refresh Rate: "  );
       System.out.println("Resolution: ");
       System.out.println("Response Time: ") ;
       System.out.println("Screen Size: ");
       System.out.println("Total Cost : " + totalCost);
       
       System.out.println("#############################");
   }
   public void setCost(int cost)
    {
        // put your code here
       totalCost=cost;
    }
    
    public void setBrand(String display)
    {
        // put your code here
       this.display=display;
    }
    
    public void setRefreshRate(int refreshRate)
    
    {
        // put your code here
      this.refreshRate=refreshRate;
    }
    public void setResolution(String resolution)
    {   
        // put your code here
       this.resolution=resolution;
    }
    public void setresponseTime(String responseTime)
    {
        // put your code here
       this.responseTime=responseTime;
    }
    public void setSize(int size)
    {
        // put your code here
       this.screenSize=size;
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
    public String getDisplay()
    {
        // put your code here
       return display;
    }
    public int getRefreshRate()
    {
        // put your code here
       return refreshRate;
    }
    public String getResolution()
    {
        // put your code here
       return resolution;
    }
    public String getResponseTime()
    {
        // put your code here
       return responseTime;
    }
    public int getScreenSize()
    {
        // put your code here
       return screenSize;
    }
    
}
