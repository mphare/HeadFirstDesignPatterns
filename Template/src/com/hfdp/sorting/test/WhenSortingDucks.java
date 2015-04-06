package com.hfdp.sorting.test;

import java.util.Arrays;

import org.junit.Test;

import com.hfdp.sorting.Duck;

public class WhenSortingDucks
{

  @Test
  public void shouldSort()
  {
    Duck[] ducks = { new Duck("Daffy", 8), new Duck("Dewey", 2), new Duck("Howard", 7), new Duck("Louie", 2),
        new Duck("Donald", 10), new Duck("Huey", 2) };

    System.out.println("Before sorting:");
    display(ducks);
    System.out.println("After sorting:");
    Arrays.sort(ducks);

    display(ducks);
  }

  public static void display(Duck[] ducks)
  {
    for (int i = 0; i < ducks.length; i++)
    {
      System.out.println(ducks[i]);
    }
  }
}
