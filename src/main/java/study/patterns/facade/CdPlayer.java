package study.patterns.facade;

public class CdPlayer {

    public void on()    {
        System.out.println("CD player is on");
    }

    public void off()   {
        System.out.println("CD player is off");
    }

    public void eject() {
        System.out.println("CD is ejected");
    }

    public void pause() {
        System.out.println("CD pause");
    }

    public void play()  {
        System.out.println("CD is playing");
    }

    public void stop()  {
        System.out.println("CD stop playing");
    }
}
