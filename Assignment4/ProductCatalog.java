public class ProductCatalog
{
    public static void main(String[] args)
    {
     Electronics el = new Electronics("Tubelight", 400, "6Months");
     Clothing cl = new Clothing("Pant",3100,28,"jeans");
     Grocery gr = new Grocery("chips", 80 , "30Days");
     System.out.println("//Electronics//");
     el.displayDetails();
     System.out.println("//Clothing//");
     cl.displayDetails();
     System.out.println("//Grocery//");
     gr.displayDetails();

    }
}
abstract class Product
{
    String name;
    double price;
    public Product(String n , double p)
    {
        this.name=n;
        this.price=p;
    }
    public abstract void displayDetails();

}
class Electronics extends Product
{
    String warrantyPeriod;
    public Electronics(String n, double p,String wp)
    {
        super(n,p);
        this.warrantyPeriod=wp;
    }
    @Override
    public void displayDetails()
    {
        System.out.println("Name:" +name);
        System.out.println("Price:" +price);
        System.out.println("Warranty Period:" +warrantyPeriod);
    }

}
class Clothing extends Product
{
    double size;
    String material;
    public Clothing(String n, double p,double s, String m)
    {
        super(n,p);
        this.size=s;
        this.material=m;
    }
    @Override
    public void displayDetails()
    {
        System.out.println("Name:" +name);
        System.out.println("Price:" +price);
        System.out.println("Size:" +size);
        System.out.println("Material used: " +material);
    }

}
class Grocery extends Product
{
    String expiryDate;
    public Grocery(String n, double p,String exp)
    {
        super(n,p);
        this.expiryDate=exp;
    }
    @Override
    public void displayDetails()
    {
        System.out.println("Name:" +name);
        System.out.println("Price:" +price);
        System.out.println("Expiry Date:" +expiryDate);
    }

}