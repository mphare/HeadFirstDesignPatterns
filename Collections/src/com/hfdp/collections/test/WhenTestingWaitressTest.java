package com.hfdp.collections.test;

import org.junit.Test;

import com.hfdp.collections.DinerMenu;
import com.hfdp.collections.PancakeHouseMenu;
import com.hfdp.collections.Waitress;

public class WhenTestingWaitressTest
{

  @Test
  public void canPrintMenu()
  {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }

}
