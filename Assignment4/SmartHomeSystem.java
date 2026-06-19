public class SmartHomeSystem {
    public static void main(String[] args) 
    {
        Door d = new Door("Automatic Door");
        Thermostat t = new Thermostat("AC");
        Sensor s= new Sensor("Alaram");
        System.out.println("// " +d.deviceName + " //");
        d.operate();
        System.out.println();
        System.out.println("// " +t.deviceName + " //");
        t.operate();
        System.out.println();
        System.out.println("// " +s.deviceName +" //");
        s.operate();
        System.out.println();
    }
}
abstract class Device
{
    String deviceName;
    public Device(String dn)
    {
        this.deviceName=dn;
    }
    abstract void operate();
}
class Door extends Device
{
    public  Door (String dn)
    {
        super(dn);
    }
    void operate()
    {
        System.out.println("Automatic Open");
    }
}
class Thermostat extends Device
{
    public Thermostat(String dn)
    {
        super(dn);
    }
    void operate()
    {
        System.out.println("Setting Temperature.....");
    }
}
class Sensor extends Device
{
    public Sensor (String dn)
    {
        super(dn);
    }
    void operate()
    {
        System.out.println("Voice");
    }
}