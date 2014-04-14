package com.nx.javabasics.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* -----------------------------------------[ ActionListenerExampleFrame ]--- */

public class ActionListenerExampleFrame extends JFrame {

  private static final int DEFAULT_WIDTH = 300;
  private static final int DEFAULT_HEIGHT = 200;

  private JPanel mPanel;

  public ActionListenerExampleFrame() {
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    setTitle("ActionListenerExampleFrame");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationByPlatform(true);

    JButton yellowButton = new JButton("Yellow");
    JButton blueButton = new JButton("Blue");
    JButton redButton = new JButton("Red");

    mPanel = new JPanel();
    mPanel.add(yellowButton);
    mPanel.add(blueButton);
    mPanel.add(redButton);

    add(mPanel);

    ColorAction yellowAction = new ColorAction(Color.YELLOW);
    ColorAction blueAction = new ColorAction(Color.BLUE);
    ColorAction redAction = new ColorAction(Color.RED);

    yellowButton.addActionListener(yellowAction);
    blueButton.addActionListener(blueAction);
    redButton.addActionListener(redAction);
  }

  /* ------------------------------------------------------[ ColorAction ]--- */

  private class ColorAction implements ActionListener {

    private Color backgroundColor;

    public ColorAction(Color c) {
      backgroundColor = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      mPanel.setBackground(backgroundColor);
    }
  }
}