public class HospitalRecords {
    public static void main(String[] args) 
    {
        InPatient ip= new InPatient("Bhagwati Kafle", 78, 309);
        OutPatient op = new OutPatient("Mohan Paudel", 28, "2026-09-02");
        ip.getTreatmentPlan();
        op.getTreatmentPlan();
    }
}
abstract class Patient
{
    private String name;
    private int age;
    public Patient(String n , int a)
    {
        this.name=n;
        this.age=a;
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int getAge()
    {
        return age;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    abstract void getTreatmentPlan();
}
class InPatient extends Patient
{
  private int roomNumber;
   public InPatient(String n , int a,int rn)
   {
    super(n,a);
    this.roomNumber=rn;
   }
   int getRoomNumber()
   {
    return roomNumber;
   }
   void setRoomNumber(int roomNumber)
   {
    this.roomNumber=roomNumber;
   }
  @Override
  void getTreatmentPlan()
  {
   System.out.println("//InPatient Treatment Plan//");
   System.out.println("Name: " +getName());
   System.out.println("Age: " +getAge());
   System.out.println("Room Number: " +getRoomNumber());
   System.out.println();
  }
}
class OutPatient extends Patient
{
  private String appointmentDate;
   public OutPatient(String n , int a,String ap)
   {
    super(n,a);
    this.appointmentDate=ap;
   }
   String getAppointmentDate()
   {
    return appointmentDate;
   }
   void setRoomNumber(String appointmentDate)
   {
    this.appointmentDate=appointmentDate;
   }
  @Override
  void getTreatmentPlan()
  {
   System.out.println("//OutPatient Treatment Plan//");
   System.out.println("Name: " +getName());
   System.out.println("Age: " +getAge());
   System.out.println("Appointment Date: " +getAppointmentDate());
   System.out.println();
  }
}