public class LibrarySystem {
    public static void main(String[] args)
    {
     LibraryItem[] item = new LibraryItem[3];
     item[0] = new Book("Automic Habit", "James Clear", 1234, "Yearly", "00100");
     item[1] = new Magazine("Muna", "Madan Puraskar Pustakalaya", 5678, "Monthly", "00200");
     item[2] = new Newspaper("The Kathmandu Post", "Kantipur Publications", 9876, "Daily", "00300");
     for(LibraryItem i : item)
     {
        i.getInfo();
     }

    }
}
abstract class LibraryItem
{
    String title;
    String author;
    int id;
    public LibraryItem(String t , String a,int id)
    {
        this.title=t;
        this.author=a;
        this.id=id;
    }
    abstract void getInfo();
}
class Book extends LibraryItem
{
    String publucationFrequency;
    String issueNumber;
    public Book(String t , String a,int id, String p, String in)
    {
        super(t, a, id);
        this.publucationFrequency=p;
        this.issueNumber=in;
    }
    @Override
    void getInfo()
    {
        System.out.println("//Book//");
        System.out.println("Title:" +title);
        System.out.println("Author: " +author);
        System.out.println("Id:" +id );
        System.out.println("Publication Frequency:" +publucationFrequency);
        System.out.println("Issue Number: " +issueNumber);
    }
}
class Magazine extends LibraryItem
{
    String publucationFrequency;
    String issueNumber;
    public Magazine(String t , String a,int id, String p , String in)
    {
        super(t, a, id);
        this.publucationFrequency=p;
        this.issueNumber=in;
    }
    @Override
    void getInfo()
    {
        System.out.println("//Magazine//");
        System.out.println("Title:" +title);
        System.out.println("Author: " +author);
        System.out.println("Id:" +id );
        System.out.println("Publication Frequency:" +publucationFrequency);
        System.out.println("Issue Number: " +issueNumber);
    }
}
class Newspaper extends LibraryItem
{
    String publucationFrequency;
    String issueNumber;
    public Newspaper(String t , String a,int id, String p , String in)
    {
        super(t, a, id);
        this.publucationFrequency=p;
        this.issueNumber=in;
    }
    @Override
    void getInfo()
    {
        System.out.println("//Newspaper//");
        System.out.println("Title:" +title);
        System.out.println("Author: " +author);
        System.out.println("Id:" +id );
        System.out.println("Publication Frequency:" +publucationFrequency);
        System.out.println("Issue Number: " +issueNumber);
    }
}