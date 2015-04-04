package com.hfdp.facade.eqptfacade;
import com.hfdp.facade.equipment.Amplifier;
import com.hfdp.facade.equipment.CdPlayer;
import com.hfdp.facade.equipment.DvdPlayer;
import com.hfdp.facade.equipment.PopcornPopper;
import com.hfdp.facade.equipment.Projector;
import com.hfdp.facade.equipment.Screen;
import com.hfdp.facade.equipment.TheaterLights;
import com.hfdp.facade.equipment.Tuner;

public class HomeTheaterFacade
{

  Amplifier     amp;
  Tuner         tuner;
  DvdPlayer     dvd;
  CdPlayer      cd;
  Projector     projector;
  TheaterLights lights;
  Screen        screen;
  PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen,
      TheaterLights lights, PopcornPopper popper)
  {
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.cd = cd;
    this.projector = projector;
    this.screen = screen;
    this.lights = lights;
    this.popper = popper;
  }

  public void watchMovie(String movie)
  {
    System.out.println("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    lights.dim();
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd();
    amp.setSurroundSound();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }

  public void endMovie()
  {
    System.out.println("Shutting down movie theater...");
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }

}
