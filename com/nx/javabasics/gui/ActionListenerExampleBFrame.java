package com.nx.javabasics.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* ----------------------------------------[ ActionListenerExampleBFrame ]--- */

public class ActionListenerExampleBFrame extends JFrame {

  private static final int DEFAULT_WIDTH = 300;
  private static final int DEFAULT_HEIGHT = 200;

  private JPanel mPanel;

  public ActionListenerExampleBFrame() {
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    setTitle("ActionListenerExampleFrame");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationByPlatform(true);

    mPanel = new JPanel();

    makeButton("Yellow", Color.YELLOW);
    makeButton("Blue", Color.BLUE);
    makeButton("Red", Color.RED);

    add(mPanel);
  }

  private void makeButton(String text, final Color color) {
    JButton btn = new JButton(text);
    mPanel.add(btn);
    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mPanel.setBackground(color);
      }
    });
  }
}