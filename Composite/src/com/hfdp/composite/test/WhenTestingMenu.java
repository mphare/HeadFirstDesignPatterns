package com.hfdp.composite.test;

import org.junit.Before;
import org.junit.Test;

import com.hfdp.composite.Menu;
import com.hfdp.composite.MenuComponent;
import com.hfdp.composite.MenuItem;
import com.hfdp.composite.Waitress;

public class WhenTestingMenu
{
  MenuComponent allMenus = null;

  @Before
  public void initialize()
  {
    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert, of course");

    allMenus = new Menu("ALL MENUS", "All Menus combined");

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99));
    pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with scrambled eggs and sausage", false,
        2.99));
    pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
    pancakeHouseMenu
        .add(new MenuItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59));

    dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
    dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce and tomato on whole wheat", true, 2.99));
    dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 2.99));
    dinerMenu.add(new MenuItem("Soup of the Day", "Soup of the day with a side of potato salad", false, 3.29));
    dinerMenu.add(new MenuItem("Hotdog", "A hot dog with saurkraut, relish and onion topped with cheese", false, 3.05));

    dinerMenu.add(dessertMenu);
    dessertMenu
        .add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust topped with vanilla ice cream", true, 1.59));
    dessertMenu.add(new MenuItem("Chocolate Pie", "Chocolate Cream Pie with a flakey crust topped with Whipped Cream",
        true, 1.49));
    dessertMenu.add(new MenuItem("Chocolate Cake", "Mile-high Chocolate Cake with a Dark Chocolate icing", true, 1.99));

    cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
        "Veggie burget on whole wheat bun, lettuce, tomato and fries", true, 3.99));
    cafeMenu.add(new MenuItem("Soup of the Day", "A cup of soup of the day, with a side salad", false, 3.69));
    cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa and guacamole", true, 4.29));

  }

  @Test
  public void shouldPrintMenus()
  {
    Waitress waitress = new Waitress(allMenus);
    waitress.printMenu();

  }

  @Test
  public void shouldPrintVegetarianMenus()
  {
    Waitress waitress = new Waitress(allMenus);
    waitress.printVegetarianMenu();

  }
}
