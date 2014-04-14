package com.nx.javabasics;

import java.util.ArrayList;
import java.util.HashSet;

/* ---------------------------------------------------------------[ Misc ]--- */

public class _7Misc {

  public static enum OS {
    Windows, Linux, BSD
  }

  public static void main(String... args) {

    /* -----------------------------------------------------[ exceptions ]--- */

    /*
    try {
    } catch (Exception e) {
    } finally {
    }
    */

    /* --------------------------------------------------------[ writing ]--- */

    /*
    PrintWriter pw = new PrintWriter(new FileWriter("asd.txt"));
    pw.println("Line1");
    pw.println("Line2");
    pw.close();
    */

    /* --------------------------------------------------------[ reading ]--- */

    /*
    BufferedReader br = new BufferedReader(new FileReader("asd.txt"));
    String line = null;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
    br.close();
    */

    /* -----------------------------------------------------------[ enum ]--- */

    OS os = OS.Windows;

    switch (os) {
      case Windows:
        System.out.println("Windows");
        break;
      case Linux:
      case BSD:
        System.out.println("Unix");
        break;
      default:
        System.out.println("Other");
        break;
    }

    /* ------------------------------------------------------[ ArrayList ]--- */

    ArrayList<Box> boxes = new ArrayList<Box>();
    boxes.add(new Box());
    boxes.add(new Box());
    boxes.add(new Box());

    for (Box b : boxes) {
      b.unWrap();
      b.whatsInTheBox();
    }

    java.util.HashSet<Integer> ints = new HashSet<Integer>();

    for (int i = 1; i <= 10; i++) {
      ints.add(i);
    }

    for (int i = 11; i <= 20; i++) {
      ints.add(i);
    }

    for (Integer i : ints) {
      System.out.println(i.toString());
    }
  }
}