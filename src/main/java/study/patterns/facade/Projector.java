package study.patterns.facade;

public class Projector {

    DvdPlayer dvdPlayer;

    public Projector(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on()    {
        System.out.println("Projector is on");
    }

    public void wideScreenMode()    {
        System.out.println("Projector set to wide screen mode");
    }

    public void off()   {
        System.out.println("Projector is off");
    }

}
