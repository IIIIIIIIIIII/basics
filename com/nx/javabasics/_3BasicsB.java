package com.nx.javabasics;

import java.util.Random;

/* ------------------------------------------------------------[ BasicsB ]--- */

public class _3BasicsB {

  /* -------------------------------------------------------------[ main ]--- */

  public static void main(String... args) {

    java.util.Date mDate = new java.util.Date();
    System.out.println(mDate);

    Random rand = new Random();
    System.out.println(rand.nextInt(100));

    String[] stringArray = new String[2];
    stringArray[0] = "hello";
    stringArray[1] = "there";
    printA(stringArray);

    printB("hey", "there");

    System.out.println(myFunction(250));
  }

  /* -----------------------------------------------------------[ printA ]--- */

  public static void printA(String[] m) {
    for (int i = 0; i < m.length; i++) {
      System.out.println(m[i]);
    }
  }

  /* -----------------------------------------------------------[ printB ]--- */

  public static void printB(String... msgs) {
    for (String s : msgs) {
      System.out.println(s);
    }
  }

  /* -------------------------------------------------------[ myFunction ]--- */

  public static int myFunction(int input) {
    int output = input;
    output *= 2;
    return output;
  }
}