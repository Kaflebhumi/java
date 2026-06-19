import java.util.Arrays;

public class FoodOrderApp {
    public static void main(String[] args) 
    {
        String[] toppings = {"Chicken" , "Mushroom" ,"Capsicum" ,"cheese"};
        String[] ingredients ={"Cucumber","Tomato","Carrot","Onion"};
        Pizza p = new Pizza("Mix Pizza", 899, "16 inch", toppings);
        Burger b = new Burger("Burger", 170, true, "Crunchy");
        Salad s = new Salad("Vegetable Salad", 200, ingredients);
        System.out.println("//Pizza Menu//");
        p.displayMenuItem();
        System.out.println();
        System.out.println("//Burger Menu//");
        b.displayMenuItem();
        System.out.println();
        System.out.println("//Salad Menu//");
        s.displayMenuItem();
        System.out.println();

    }
}
abstract class FoodItem 
{
  private String name;
  private double price;
  public FoodItem(String n , double p)
  {
    this.name=n;
    this.price=p;
  }
  String getName()
  {
    return name;
  }
  void setName(String name)
  {
    this.name=name;
  }
  double getPrice()
  {
    return price;
  }
  void setPrice(double price)
  {
    this.price=price;
  }
  abstract void displayMenuItem();
}
class Pizza extends FoodItem
{
    private String size;
    private String[] toppings;
    public Pizza(String n , double p,String s,String[] t)
    {
        super(n,p);
        this.size=s;
        this.toppings=t;
    }
    String getSize()
    {
        return size;
    }
    void setSize(String size)
    {
        this.size=size;
    }
    String[] getToppings()
    {
        return toppings;
    }
    void setToppings(String[] toppings)
    {
        this.toppings=toppings;
    }
    void displayMenuItem()
    {
        System.out.println("Item: " +getName());
        System.out.println("Price: " +getPrice());
        System.out.println("Size: "+getSize());
        System.out.println("Toppings: " +Arrays.toString(getToppings()));
    }
}
class Burger extends FoodItem
{
    private Boolean hasCheese;
    private String pattyType;
    public Burger(String n , double p,Boolean c,String pt)
    {
        super(n,p);
        this.hasCheese=c;
        this.pattyType=pt;
    }
    Boolean getHasCheese()
    {
        return hasCheese;
    }
    void setHasCheese(Boolean hasCheese)
    {
        this.hasCheese=hasCheese;
    }
    String getPattyType()
    {
        return pattyType;
    }
    void setPattyType(String pattyType)
    {
        this.pattyType=pattyType;
    }
    void displayMenuItem()
    {
        System.out.println("Item: " +getName());
        System.out.println("Price: " +getPrice());
        System.out.println("Cheese: "+getHasCheese());
        System.out.println("Patty Type: " +getPattyType());
    }
}
class Salad extends FoodItem
{
    private String[] ingredients;
    public Salad(String n , double p,String[] i)
    {
        super(n,p);
        this.ingredients=i;
    }
    String[] getIngredients()
    {
        return ingredients;
    }
    void setIngredients(String[] ingredients)
    {
        this.ingredients=ingredients;
    }
    void displayMenuItem()
    {
        System.out.println("Item: " +getName());
        System.out.println("Price: " +getPrice());
        System.out.println("Ingredients: " +Arrays.toString(getIngredients()));
    }
}