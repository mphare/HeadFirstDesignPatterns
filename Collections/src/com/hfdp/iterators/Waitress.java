package com.hfdp.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress
{
  Menu      pancakeHouseMenu;
  Menu      dinerMenu;
  Menu      cafeMenu;

  ArrayList menus;

  public Waitress(ArrayList menus)
  {
    this.menus = menus;
  }

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu)
  {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.cafeMenu = cafeMenu;
  }

  public void printMenu()
  {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinerIterator = dinerMenu.createIterator();
    Iterator cafeIterator = cafeMenu.createIterator();
    System.out.println("Breakfast ----");
    printMenu(pancakeIterator);
    System.out.println("Lunch ----");
    printMenu(dinerIterator);
    System.out.println("Dinner ----");
    printMenu(cafeIterator);
  }

  // public void printMenu()
  // {
  // Iterator menuIterator = menus.iterator();
  // while (menuIterator.hasNext())
  // {
  // Menu menu = (Menu) menuIterator.next();
  // printMenu(menu.createIterator());
  // }
  // }

  private void printMenu(Iterator iterator)
  {
    while (iterator.hasNext())
    {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem.getName() + " ");
      System.out.println(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());

    }
  }

}
