package com.hfdp.collections.test;

import org.junit.Test;

import com.hfdp.collections.CafeMenu;
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
    CafeMenu cafeMenu = new CafeMenu();

    // ArrayList menus = null;
    // menus.add(pancakeHouseMenu);
    // menus.add(dinerMenu);
    // menus.add(cafeMenu);

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
    // Waitress waitress = new Waitress(menus);
    waitress.printMenu();
  }
}
