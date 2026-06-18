public class SmartDevices
{
     public static void main(String[] args)
{
   SmartPhone sp = new SmartPhone("Iphone 18","98764085");
   SmartWatch sw = new SmartWatch("OPPO 18","78490230J");
      sp.turnOn();
      sp.turnOff();

      sw.turnOn();
      sw.turnOff();
}
}
abstract class Devices{
    public String brand;
    public String model;
    public Devices(String br, String mo)
    {
        this.brand=br;
        this.model=mo;
    }
    public void turnOn()
    {
        System.out.println("Turning On....");

    }
    public void turnOff()
    {
        System.out.println("Turning Off.....");
    }
}
 class SmartPhone extends Devices
 {
    public SmartPhone(String br, String mo)
    {
        super(br,mo);
    }
    @Override
    public void turnOn()
    {
        System.out.println("The Brand:" +brand +" with Model Number:" +model +"is turning on.");
    }
    public void turnOff()
    {
        System.out.println("The Brand:" +brand +" with Model Number:" +model +"is turning off.");
    }
 }
  class SmartWatch extends Devices
 {
    public SmartWatch(String br, String mo)
    {
        super(br,mo);
    }
    @Override
    public void turnOn()
    {
        System.out.println("The Brand:" +brand +"with Model Number:" +model +"is turning on.");
    }
    public void turnOff()
    {
        System.out.println("The Brand:" +brand +"with Model Number:" +model +"is turning off.");
    }
 }