package com.nx.javabasics.gui.mouse;

import javax.swing.*;

/* --------------------------------------------------[ MouseExampleFrame ]--- */

public class MouseExampleFrame extends JFrame {
  public MouseExampleFrame() {
    add(new MouseComponent());
    pack();
  }
}