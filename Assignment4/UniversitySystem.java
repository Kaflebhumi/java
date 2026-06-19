public class UniversitySystem {
    public static void main(String[] args) 
    {
        Student s = new Student("Jenish Bhandari", 987, "BSC.CSIT");
        Teacher t = new Teacher("Jenisha Bhandari", 743, "Maths");
        Admin a = new Admin("Anju Shrestha", 187,"Management");
        System.out.println("//Student Details//");
        s.getRoleDetails();
        System.out.println(); 
        System.out.println("//Teacher Details//");
        t.getRoleDetails();
        System.out.println(); 
        System.out.println("//Admin Details//");
        a.getRoleDetails();
        System.out.println(); 
    }
}
abstract class Person
{
    private String name;
    private int id;
    public Person(String n,int id)
    {
        this.name=n;
        this.id=id;
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int getId()
    {
        return id;
    }
    void setId(int id)
    {
      this.id=id;
    }
    public abstract void getRoleDetails();
}
class Student extends Person
{
  private String program;
  public Student(String n , int id ,String p)
  {
    super(n, id);
    this.program=p;
  }
   String getProgram()
    {
        return program;
    }
    void setProgram(String program)
    {
        this.program=program;
    }
    public void getRoleDetails()
    {
        System.out.println("Name: " +getName());
        System.out.println("Id: " +getId());
        System.out.println("Program: " +getProgram());
    }
}
class Teacher extends Person
{
  private String subject;
  public Teacher(String n , int id ,String s)
  {
    super(n, id);
    this.subject=s;
  }
   String getSubject()
    {
        return subject;
    }
    void setSubject(String subject)
    {
        this.subject=subject;
    }
    public void getRoleDetails()
    {
        System.out.println("Name: " +getName());
        System.out.println("Id: " +getId());
        System.out.println("Subject: " +getSubject());
    }
}
class Admin extends Person
{
  private String department;
  public Admin(String n , int id ,String d)
  {
    super(n, id);
    this.department=d;
  }
   String getDepartment()
    {
        return department;
    }
    void setDepartment(String department)
    {
        this.department=department;
    }
    public void getRoleDetails()
    {
        System.out.println("Name: " +getName());
        System.out.println("Id: " +getId());
        System.out.println("Department: " +getDepartment());
    }
}