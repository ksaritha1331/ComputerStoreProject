
/**
 * Write a description of class HardDisk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardDisk
{
    // instance variables - replace the example below with your own
    private String deviceBrand;
    private String size;
    private String type;
    private int totalCost;
    
    private String modelId;
    private String serialNo;
    private String revision;

    private String hddInterface;
    private String performance;
    private double temperature;
    private String powerOnTime;

    /**
     * Constructor for objects of class HardDisk
     */
    
    
    public HardDisk()
    {
        // initialise instance variables
        
    }
    public void setDetails(String brand,String size,String type,int cost)
    {
        this.deviceBrand=brand;
        this.size=size;
        this.type=type;
        this.totalCost=cost;
    }
    public int getCost()
    {
        return totalCost;
        
    }
    public String getBrand()
    {
      return deviceBrand;
        
    }
     public String getSize()
    {
      return size;
        
    }
    public String getType()
    {
      return type;
        
    }
    public void display()
   { 
       
       System.out.println("#############################");
       System.out.println("Hard Disk Brand:" + deviceBrand);
       System.out.println("Size: " + size  );
       System.out.println("Hard Disk Type: " + type);
       System.out.println("Total Cost :" + totalCost);
       System.out.println("#############################");
   }
}    
