package com.whitehare.hsdp.singleton.chocolate.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.whitehare.hsdp.singleton.chocolate.ChocolateBoiler;

public class WhenMakingChocolate
{

  @Test
  public void processChocolate()
  {
    boolean empty;
    boolean boiled;
    ChocolateBoiler obj1 = ChocolateBoiler.getInstance();

    assertEquals(true, obj1.isEmpty());
    assertFalse(obj1.isBoiled());
    obj1.fill();
    assertFalse(obj1.isBoiled());
    assertFalse(obj1.isEmpty());

    obj1.boil();
    assertTrue(obj1.isBoiled());
    assertFalse(obj1.isEmpty());

    obj1.drain();
    assertTrue(obj1.isBoiled());
    assertTrue(obj1.isEmpty());

  }

}
