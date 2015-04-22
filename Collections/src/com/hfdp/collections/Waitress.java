package com.hfdp.collections;

public class Waitress
{
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu        dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu)
  {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu()
  {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinerIterator = dinerMenu.createIterator();
    System.out.println("Breakfast ----");
    printMenu(pancakeIterator);
    System.out.println("Lunch ----");
    printMenu(dinerIterator);
  }

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