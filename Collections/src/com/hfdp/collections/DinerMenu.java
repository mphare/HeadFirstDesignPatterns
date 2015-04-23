package com.hfdp.collections;

import java.util.Iterator;

public class DinerMenu implements Menu
{
  static final int MAX_ITEMS     = 5;
  int              numberOfItems = 0;
  MenuItem[]       menuItems;

  public DinerMenu()
  {
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce and tomato on whole wheat", true, 2.99);
    addItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 2.99);
    addItem("Soup of the Day", "Soup of the day with a side of potato salad", false, 3.29);
    addItem("Hotdog", "A hot dog with saurkraut, relish and onion topped with cheese", false, 3.05);

  }

  public void addItem(String name, String description, boolean vegetarian, double price)
  {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS)
    {
      System.out.println("Sorry, the menu is full! Cannot add this item to the menu");
    } else
    {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }

  @Override
  public Iterator createIterator()
  {
    return new DinerMenuIterator(menuItems);
  }

  // public MenuItem[] getMenuItems()
  // {
  // return menuItems;
  // }

}
