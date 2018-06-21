package study.patterns.facade;

public class HomeTheaterFacade {

    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theateLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights theateLights, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theateLights = theateLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie)    {
        System.out.println("get ready to watch a movie..");
        popcornPopper.on();
        popcornPopper.pop();
        theateLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setCdPlayer(cdPlayer);
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie()  {
        System.out.println("Shutting movie theater down..");
        popcornPopper.off();
        theateLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
