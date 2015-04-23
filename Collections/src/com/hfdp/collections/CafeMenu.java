package com.hfdp.collections;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu
{
  Hashtable menuItems = new Hashtable();

  public CafeMenu()
  {
    addItem("Veggie Burger and Air Fries", "Veggie burget on whole wheat bun, lettuce, tomato and fries", true, 3.99);
    addItem("Soup of the Day", "A cup of soup of the day, with a side salad", false, 3.69);
    addItem("Burrito", "A large burrito, with whole pinto beans, salsa and guacamole", true, 4.29);
  }

  public void addItem(String name, String description, boolean vegetarian, double price)
  {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.put(menuItem.getName(), menuItem);
  }

  public Iterator createIterator()
  {
    return menuItems.values().iterator();
  }

  // public Hashtable getItem()
  // {
  // return menuItems;
  // }

}
