package study.patterns.facade;

public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public Amplifier(Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer) {
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
    }

    public void on()    {
        System.out.println("Amplifier is on");
    }

    public void off()   {
        System.out.println("Amplifier is off");
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setVolume(int level)    {
        System.out.println("Amplifier volume set up to " + level);
    }
}
