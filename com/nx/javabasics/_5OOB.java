package com.nx.javabasics;

/* ----------------------------------------------------------------[ OOB ]--- */

import java.awt.*;

public class _5OOB {

  public static void main(String... args) {

    A a = new A();
    A.B b = a.new B();
    A.C c = new A.C();

    Pen pen = new Pen(new Color(255, 255, 255));
    System.out.println(pen.getColor());
    pen.setColor(new Color(0, 0, 0));
    System.out.println(pen.getColor());

    MagicBox mb = new MagicBox();
    mb.guess(-75);

    Human h = new Human("John");
    h.sleep();

    Student s = new Student("Sam", "Asd");
    s.sleep();

    Human student = new Student("Paul", "Somewhere");

    MysteryBox mystBox = new MysteryBox();
    System.out.println(mystBox.toString());

    Object myObj = new Human("HumanName");

    Human human = (Human) myObj;
    human.sleep();
  }
}

/* ------------------------------------------------------------------[ A ]--- */

class A {
  class B {
  }

  static class C {
  }

  void f() {
    class D {
    }
  }
}

/* ----------------------------------------------------------------[ Pen ]--- */

class Pen {
  private java.awt.Color mColor;

  Pen(Color c) {
    mColor = c;
  }

  public void setColor(Color mColor) {
    this.mColor = mColor;
  }

  public Color getColor() {
    return this.mColor;
  }
}

/* -----------------------------------------------------------[ MagicBox ]--- */

class MagicBox extends Box {
}

/* ----------------------------------------------------[ Human & Student ]--- */

class Human {

  private String name;

  Human(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println(name + " sleeps an hour.");
  }
}

class Student extends Human {

  private String institute;

  Student(String name, String ins) {
    super(name);
    institute = ins;
  }

  @Override
  public void sleep() {
  }

  public void studentOnlyMethod() {
  }
}

/* ---------------------------------------------------------[ MysteryBox ]--- */

class MysteryBox extends Box {
  @Override
  public String toString() {
    return super.toString();
  }
}