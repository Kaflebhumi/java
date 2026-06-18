public class MusicApp {
    public static void main(String[] args)
    {
      Song[] song = new Song[3];
      song[0]=new hiphopSong("Lose Yourself", "Eminem");
      song[1] = new PopSong("Shape of You", "Ed Sheeran");
      song[2] = new ClassicalSong("Siri Ma Siri", "Narayan Gopal");
      for (Song s:song)
      {
        s.play();
      }
    }
}
abstract class Song
{
    String title;
    String artist;
    public Song(String t , String a)
    {
        this.title=t;
        this.artist=a;
    }
    abstract void play();
}
class hiphopSong extends Song
{
  public hiphopSong(String t , String a)
  {
    super(t,a);
  }
  @Override
  void play()
  {
    System.out.println("//Hiphop Song//");
    System.out.println("Title: " +title);
    System.out.println("Artist: " +artist);
    System.out.println(title+ " is playing.....");
    System.out.println();
  }
}
class PopSong extends Song
{
  public PopSong(String t , String a)
  {
    super(t,a);
  }
  @Override
  void play()
  {
    System.out.println("//Pop Song//");
    System.out.println("Title: " +title);
    System.out.println("Artist: " +artist);
    System.out.println(title+ " will be played in 2 minutes.....");
    System.out.println();
  }
}
class ClassicalSong extends Song
{
  public ClassicalSong(String t , String a)
  {
    super(t,a);
  }
  @Override
  void play()
  {
    System.out.println("//Classical Song//");
    System.out.println("Title: " +title);
    System.out.println("Artist: " +artist);
    System.out.println(title+ " is ready to play.....");
    System.out.println();
  }
}