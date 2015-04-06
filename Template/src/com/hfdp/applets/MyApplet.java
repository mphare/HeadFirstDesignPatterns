package com.hfdp.applets;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet
{

  String message;

  public void init()
  {
    message = "Hello World, I'm Alive!";
  }

  public void start()
  {
    message = "Now I'm starting up...";
  }

  public void stop()
  {
    message = "Now I'm stopping";
  }

  public void destroy()
  {
    // applet is going away
  }

  public void paint(Graphics g)
  {
    g.drawString(message, 5, 15);
  }

}
