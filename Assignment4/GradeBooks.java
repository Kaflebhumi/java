public class GradeBooks {
    public static void main(String[] args) {
        double[] gs_marks={90,87,85,97,85};
        double[] ug_marks={88,6,98,67,56};
        GraduateStudent gs = new GraduateStudent("Jenisha",2,gs_marks,"ABC");
        UnderGraduateStudent ug = new UnderGraduateStudent("Jenish",11,ug_marks);
        System.out.println("//Graduate Student Detail//");
        System.out.println("Name: " +gs.getName());
        System.out.println("Id:" +gs.getRollNumber());
        System.out.println("Average Marks: " +gs.calculateAverage());
        System.out.println("Thesis Topic: " +gs.getThesisTopic());

        System.out.println("//Under Graduate Student Detail//");
        System.out.println("Name: " +ug.getName());
        System.out.println("Id:" +ug.getRollNumber());
        System.out.println("Average Marks: " +ug.calculateAverage());
        

    }
}
class Student{
    private String name;
    private int rollNumber;
    private double[] marks;
    public Student(String n , int rn , double[] m)
        {
            this.name=n;
            this.rollNumber=rn;
            this.marks = m;
        }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getRollNumber()
    {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber)
    {
        this.rollNumber=rollNumber;
    }
    public double[] getMarks ()
    {
        return marks;
    }
    public void setMarks(double[] marks)
    {
        this.marks=marks;
    }
    double calculateAverage()
    {
        double total=0;
        if(marks.length==0)
        {
            return 0;
        }
        else
        {
        for(int i=0;i<marks.length;i++)
          {
           total=total+ marks[i];
          }
          return total/marks.length;
        }
    }
}
class GraduateStudent extends Student
{
    private String thesisTopic;
    public String getThesisTopic()
    {
        return thesisTopic;
    }
    public void setThesisTopic(String thesisTopic)
    {
        this.thesisTopic=thesisTopic;
    }
    public GraduateStudent(String n , int rn , double[] m, String tt)
    {
        super(n, rn, m);
        this.thesisTopic=tt;
    }
    void printThesisTopic()
    {
        System.out.println("The Thesis Topic:" +thesisTopic);
    }

}
class UnderGraduateStudent extends Student
{
  public UnderGraduateStudent(String n , int rn , double[] m)
    {
        super(n, rn, m);
    } 
}