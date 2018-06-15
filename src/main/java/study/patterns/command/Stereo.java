package study.patterns.command;

public class Stereo {

    private int volume = 0;
    private boolean CD  = false;

    public void on()    {
        System.out.println("Stereo is on");
    }

    public void off()   {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        CD = true;
        System.out.println("Set CD in");
    }

    public void setVolume (int volume)  {
        this.volume = volume;
        System.out.println("Volume set to " + this.volume);
    }
}
