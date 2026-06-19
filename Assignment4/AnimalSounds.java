public class AnimalSounds {
    public static void main(String[] args)
    {
      Dog d = new Dog();
      Cat c = new Cat();
      Crow e = new Crow();
      d.makeSound();
      c.makeSound();
      e.makeSound();
    }
}
abstract class Animal
{
    void makeSound(){
        System.out.println("Animal Is Making Sound....");
    }

}
class Dog extends Animal
{
  @Override
  void makeSound()
  {
    System.out.println("Dog:Barking");
  }
}
class Cat extends Animal{
    @Override
    void makeSound()
    {
      System.out.println("Cat:Meow Meow Meow");  
    }
}
class Crow extends Animal{
    @Override
    void makeSound()
    {
      System.out.println("Crow:Caw Caw Caw");  
    }
}