public class GameCharacters {
    public static void main(String[] args)
    {
      Warrior w = new Warrior("Riya");
      Archer a = new Archer("Aayusha", 50);
      Mage m = new Mage("Pimbo");
      System.out.println("//Warrior//");
      w.attack(); 
      System.out.println();
      System.out.println("//Archer//");
      a.attack();  
       System.out.println();
      System.out.println("//Mage//");
      m.attack();   
    }
}
abstract class GameCharacter
{
    String name;
    public GameCharacter(String n)
    {
        this.name=n;
    }
    abstract void attack();
}
class Warrior extends GameCharacter
{
    public Warrior(String n)
    {
        super(n);
    }
    @Override
    void attack()
    {
        System.out.println("Name: " +name);
        System.out.println("Attacked with knife");
    }
}
class Archer extends GameCharacter
{
    int arrowCount;
    public Archer(String n,int count)
    {
        super(n);
        this.arrowCount=count;
    }
    @Override
    void attack()
    {
        System.out.println("Name: " +name);
        System.out.println("Number of Arrows: " +arrowCount);
        System.out.println("Attacked with Arrow");
    }
}
class Mage extends GameCharacter
{
    public Mage(String n)
    {
        super(n);
    }
    @Override
    void attack()
    {
        System.out.println("Name: " +name);
        System.out.println("Attacked with stone ");
    }
}