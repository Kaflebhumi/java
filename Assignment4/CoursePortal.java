public class CoursePortal {
    public static void main(String[] args) 
    {
        LiveCourse lc = new LiveCourse("java", "6 Months", "Ram hari ", "6:30 - 7:45 PM");
        RecordedCourse rc = new RecordedCourse("PTE", "4week", "Sanjeeta Gurung", 6);
        System.out.println("//Live Course Details//");
        lc.getCourseInfo();
        System.out.println();
        System.out.println("//Recorded Course Details//");
        rc.getCourseInfo();
        System.out.println();
    }
}
abstract class Course
{
    private String title;
    private String duration;
    private String instructor;
    public Course(String t, String d , String i)
    {
        this.title=t;
        this.duration=d;
        this.instructor=i;
    }
    String getTitle()
    {
        return title;
    }
    void setTitle(String title)
    {
        this.title=title;
    }
    String getDuration()
    {
        return duration;
    }
    void setDuration(String duration)
    {
        this.duration=duration;
    }
    String getInstructor()
    {
        return instructor;
    }
    void setInstructor(String instructor)
    {
        this.instructor=instructor;
    }
    abstract void getCourseInfo();
}
class LiveCourse extends Course
{
   private String scheduleTime;
   public LiveCourse(String t, String d , String i,String time)
   {
    super(t, d, i);
    this.scheduleTime=time;
   }
   String getScheduleTime()
    {
        return scheduleTime;
    }
    void setScheduleTime(String scheduleTime)
    {
        this.scheduleTime=scheduleTime;
    }
   void getCourseInfo()
   {
     System.out.println("Course Title: " +getTitle());
     System.out.println("Duration: " +getDuration());
     System.out.println("Instructor: " +getInstructor());
     System.out.println("Schedule Time: " +getScheduleTime());
   }
}
class RecordedCourse extends Course
{
   private int videoCount;
   public RecordedCourse(String t, String d , String i,int count)
   {
    super(t, d, i);
    this.videoCount=count;
   }
    int  getVideoCount()
    {
        return videoCount;
    }
    void setVideoCount(int videoCount)
    {
        this.videoCount=videoCount;
    }
   void getCourseInfo()
   {
     System.out.println("Course Title: " +getTitle());
     System.out.println("Duration: " +getDuration());
     System.out.println("Instructor: " +getInstructor());
     System.out.println("Number of Videos: " +getVideoCount());
   }
}