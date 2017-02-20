
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
    
    public void setDetails(String display,int refreshRate,String resolution,String responseTime,int screenSize,int cost)
    {
        this.display=display;
        this.refreshRate=refreshRate;
        this.resolution=resolution;
        this.responseTime= responseTime;
        this.screenSize=screenSize;
        this.totalCost=cost;
    }
    
   public void display()
   { 
       
       System.out.println("#############################");
       System.out.println("Display : " + display);
       System.out.println("Refresh Rate: " + refreshRate);
       System.out.println("Resolution: " + resolution);
       System.out.println("Response Time: " + responseTime) ;
       System.out.println("Screen Size: " + screenSize);
       System.out.println("Total Cost : " + totalCost);
       
       System.out.println("#############################");
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
