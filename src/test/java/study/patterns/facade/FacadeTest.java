package study.patterns.facade;

import org.junit.Test;

public class FacadeTest {

    @Test
    public void facadeTest()    {

        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector(dvd);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();
        Amplifier amp = new Amplifier(tuner, dvd, cd);
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
        homeTheater.watchMovie("Alone in the dark");
        homeTheater.endMovie();
    }
}
