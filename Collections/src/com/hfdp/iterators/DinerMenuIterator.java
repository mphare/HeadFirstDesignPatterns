package com.hfdp.iterators;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator
{
  MenuItem[] items;
  int        position = 0;

  public DinerMenuIterator(MenuItem[] items)
  {
    this.items = items;
  }

  @Override
  public boolean hasNext()
  {
    if (position >= items.length || items[position] == null)
    {
      return false;
    } else
    {
      return true;
    }
  }

  @Override
  public Object next()
  {
    MenuItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }

  @Override
  public void remove()
  {
    if (position <= 0)
    {
      throw new IllegalStateException("You cannot remove and item util you have added at least one item");

    }

    if (items[position] != null)
    {
      for (int i = position - 1; i < (items.length - 1); i++)
      {
        items[i] = items[i + 1];
      }

      items[items.length - 1] = null;

    }

  }

}
