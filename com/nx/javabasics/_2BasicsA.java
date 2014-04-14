package com.nx.javabasics;

/* ------------------------------------------------------------[ BasicsA ]--- */

public class _2BasicsA {

  public static void main(String... args) {

    /* -----------------------------------------------------[ primitives ]--- */

    byte mByte = 123;
    short mShort = 12345;
    int mInt = 1234567890;
    long mLong = 1234567890123456789L;
    float mFloat = 3.14F;
    double mDouble = 6.28;
    char mChar = 'X';
    boolean mBool = true;

    System.out.println(Byte.MIN_VALUE + " / " + Byte.MAX_VALUE);

    /* -----------------------------------------------------[ conversion ]--- */

    String stringInt = "375";
    int myInt = Integer.parseInt(stringInt);

    int i1 = 375;
    double d1 = i1;

    double d2 = 3.75;
    int i2 = (int) d2;

    /* ---------------------------------------------------------[ arrays ]--- */

    int[] arr1 = new int[5];

    int[][][][][] arr2 = new int[5][5][5][5][5];

    int arr3[] = {1, 2, 3, 4, 5};

    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]); // 1, 2, 3, 4, 5
    }

    boolean[] arr4 = new boolean[5];

    System.out.println(arr4[2] + ", " + arr4[4]); // false, false

    /* -------------------------------------------------------[ equality ]--- */

    int a = 666;
    int b = 666;
    int c = 777;

    System.out.println(a == b); // true
    System.out.println(b == c); // false

    Integer a1 = new Integer(a);
    Integer b1 = new Integer(b);

    System.out.println(a1 == b1); // false

    System.out.println(a1.equals(b1)); // true

  }
}