package com.hfdp.iterators.test;

import org.junit.Test;

import com.hfdp.iterators.CafeMenu;
import com.hfdp.iterators.DinerMenu;
import com.hfdp.iterators.PancakeHouseMenu;
import com.hfdp.iterators.Waitress;

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
