package Calls;

public class SmartPhone extends Phone implements Camera , MusicPlayer  {
    public void click()
    {
      System.out.println("Click Method");
    }

    public void record()
    {
      System.out.println("Record Method");
    }

    public void play()
    {
      System.out.println("Play Method");
    }

    public void stop()
    {
      System.out.println("Stop Method");
    }

    public void call()
    {
      super.call();
    }

    public void sms()
    {
      super.sms();
    }
}
