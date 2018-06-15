package study.patterns.command;

public class Light {

    private String place;

    public Light(String place) {
        this.place = place;
    }

    public void on()    {
        System.out.println(place + " light is on");
    }

    public void off()   {
        System.out.println(place + "light is off");
    }

}
