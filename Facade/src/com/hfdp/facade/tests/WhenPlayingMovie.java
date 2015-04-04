package com.hfdp.facade.tests;
import org.junit.Test;

import com.hfdp.facade.eqptfacade.HomeTheaterFacade;
import com.hfdp.facade.equipment.Amplifier;
import com.hfdp.facade.equipment.CdPlayer;
import com.hfdp.facade.equipment.DvdPlayer;
import com.hfdp.facade.equipment.PopcornPopper;
import com.hfdp.facade.equipment.Projector;
import com.hfdp.facade.equipment.Screen;
import com.hfdp.facade.equipment.TheaterLights;
import com.hfdp.facade.equipment.Tuner;

public class WhenPlayingMovie
{
  Amplifier     amp       = new Amplifier();
  Tuner         tuner     = new Tuner();
  DvdPlayer     dvd       = new DvdPlayer();
  CdPlayer      cd        = new CdPlayer();
  Projector     projector = new Projector();
  TheaterLights lights    = new TheaterLights();
  Screen        screen    = new Screen();
  PopcornPopper popper    = new PopcornPopper();

  @Test
  public void shouldPlayMovie()
  {
    HomeTheaterFacade htf = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
    htf.watchMovie("Superman");
  }

  @Test
  public void shouldEndMovie()
  {
    HomeTheaterFacade htf = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
    htf.endMovie();

  }

}
