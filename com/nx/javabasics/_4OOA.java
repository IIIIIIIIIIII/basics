package com.nx.javabasics;

/* ----------------------------------------------------------------[ OOA ]--- */

import java.util.Random;

public class _4OOA {

  static int x = 1337;

  static void f(int x) {
    System.out.println(x);
    System.out.println(_4OOA.x);
  }

  public static void main(String... args) {
    f(42);

    Box box = new Box();
    box.guess(-42);
    box.whatsInTheBox();
    box.unWrap();
    box.whatsInTheBox();

    System.out.println(box.getNumberOfBoxes());

    for (int i = 0; i < 5000; i++) {
      new Box();
    }

    System.out.println(box.getNumberOfBoxes());

    Box redBox = new Box();
    Box yellowBox = new Box();

    Box favBox = redBox;
    favBox = yellowBox;

    System.out.println(redBox == yellowBox); // false
    System.out.println(yellowBox == favBox); // true

    System.out.println(redBox.equals(yellowBox)); // false
    System.out.println(yellowBox.equals(favBox)); // true

    final Box finalBox = new Box();
  }
}

/* ----------------------------------------------------------------[ Box ]--- */

class Box {

  /* -----------------------------------------------------[ data_members ]--- */

  private static int numberOfBoxes;

  private boolean wrapped;
  private int content;

  {
    numberOfBoxes += 1;
    wrapped = true;
    content = new Random().nextInt(100) * -1;
  }

  /* ----------------------------------------------------------[ methods ]--- */

  public void wrap() {
    wrapped = true;
  }

  public void unWrap() {
    wrapped = false;
  }

  public void guess(int i) {
    if (i == content) {
      System.out.println(":)" + content);
    } else {
      System.out.println(":(");
    }
  }

  public void whatsInTheBox() {
    if (!isWrapped()) {
      System.out.println("The content of your box is: " + content);
    } else {
      System.out.println("Unwrap your box before checking its content!");
    }
  }

  private boolean isWrapped() {
    return wrapped;
  }

  public int getNumberOfBoxes() {
    return numberOfBoxes;
  }

  public static int getNoOfBoxes() {
    return numberOfBoxes;
  }
}