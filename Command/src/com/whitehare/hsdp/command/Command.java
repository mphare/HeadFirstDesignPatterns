package com.whitehare.hsdp.command;

public interface Command
{
  public void execute();

  public void undo();
}
