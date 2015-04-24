package com.hfdp.composite.test;

import org.junit.Test;

import com.hfdp.composite.Menu;
import com.hfdp.composite.MenuComponent;
import com.hfdp.composite.MenuItem;
import com.hfdp.composite.Waitress;

public class WhenTestingMenu
{

  @Test
  public void shouldPrintMenus()
  {
    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert, of course");

    MenuComponent allMenus = new Menu("ALL MENUS", "All Menus combined");

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
    dinerMenu.add(dessertMenu);
    dessertMenu
        .add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust topped with vanilla ice cream", true, 1.59));

    Waitress waitress = new Waitress(allMenus);
    waitress.printMenu();

  }
}
