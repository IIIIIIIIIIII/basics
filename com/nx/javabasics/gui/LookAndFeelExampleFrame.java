package com.nx.javabasics.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* --------------------------------------------[ LookAndFeelExampleFrame ]--- */

public class LookAndFeelExampleFrame extends JFrame {

  private JPanel mPanel;

  public LookAndFeelExampleFrame() {
    mPanel = new JPanel();

    UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
    for (UIManager.LookAndFeelInfo info : infos) {
      makeButton(info.getName(), info.getClassName());
    }

    add(mPanel);
    pack();
  }

  private void makeButton(String name, final String lafName) {

    System.out.println(name + " / " + lafName);

    JButton btn = new JButton(name);
    mPanel.add(btn);

    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          UIManager.setLookAndFeel(lafName);
          SwingUtilities.updateComponentTreeUI(LookAndFeelExampleFrame.this);
          pack();
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    });
  }
}