package com.nx.javabasics;

/* ----------------------------------------------------------------[ OOC ]--- */

public class _6OOC {

  public static final double PI = 3.14;

  public static void main(String... args) {

    Dog d = new Dog("Dawg");
    d.sleep();
    d.fly();

    new Duck("Donald").fly();
    new Duck().fly();

    Pet myPet = d;
    myPet.fly();

    System.out.println(d instanceof Dog); // true
    System.out.println(d instanceof Pet); // true
    System.out.println(d instanceof Object); // true
  }
}

/* ---------------------------------------------------[ Pet & Dog & Duck ]--- */

abstract class Pet {

  protected String name;

  public void sleep() {
    System.out.println(name + " sleeps.");
  }

  public abstract void fly();
}

class Dog extends Pet {

  Dog(String name) {
    this.name = name;
  }

  {
    // asd
  }

  static {
    // dsa
  }

  @Override
  public void fly() {
    System.out.println(name + " can't fly.");
  }
}

class Duck extends Pet {

  Duck(String n) {
    name = n;
  }

  Duck() {
    this("DefaultDuckName");
  }

  @Override
  public void fly() {
    System.out.println(this.name + " flies.");
  }
}

/* ------------------------------------------------------------------[ X ]--- */

class X {
  public void overloaded(int a) {}
  public void overloaded(double a) {}
  public void overloaded(int a, int b) {}
}

/* ---------------------------------------------------------[ I1, I2, I3 ]--- */

interface I1 {}

interface I2 {}

interface I3 extends I1, I2 {}

/* ---------------------------------------------------------[ I1, I2, I3 ]--- */

interface Readable {
  public abstract void read();
}

class Age implements Readable {
  @Override
  public void read() {
  }
}