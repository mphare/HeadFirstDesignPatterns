package com.whitehare.hsdp.singleton.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.whitehare.hsdp.singleton.Singleton;

public class WhenTestingUniqueness
{

  @Test
  public void isUniqueAndEqual()
  {
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    int startValue = 3;
    int endValue;

    obj1.setUniqueInteger(startValue);
    endValue = obj2.getUniqueInteger();

    assertEquals(startValue, endValue);
  }

}
