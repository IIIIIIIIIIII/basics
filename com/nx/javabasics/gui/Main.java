package com.nx.javabasics.gui;

import javax.swing.*;

/* ---------------------------------------------------------------[ Main ]--- */

public class Main {

  public static void main(String... args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JFrame frame = new ExampleFrame();
        frame.setVisible(true);
      }
    }
    );
  }
}