package study.patterns.facade;

public class TheaterLights {

    public void on()    {
        System.out.println("Lights is on");
    }

    public void off()   {
        System.out.println("Lights is off");
    }

    public void dim(int level)  {
        System.out.println("Lights level set to " + level);
    }

}
