package study.patterns.facade;

public class DvdPlayer {

    public void on()    {
        System.out.println("Dvd is on");
    }

    public  void off()  {
        System.out.println("Dvd is off");
    }
    public void eject() {
        System.out.println("Dvd is ejected");
    }

    public void pause() {
        System.out.println("Dvd on pause");
    }

    public void play()  {
        System.out.println("Dvd is playing");
    }

    public void stop()  {
        System.out.println("Dvd is stopped");
    }
}
