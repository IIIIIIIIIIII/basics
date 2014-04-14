package com.nx.javabasics.gui.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/* -----------------------------------------------------[ MouseComponent ]--- */

public class MouseComponent extends JComponent {

  private static final int DEFAULT_WIDTH = 300;
  private static final int DEFAULT_HEIGHT = 200;

  private static final int SIDELENGTH = 10;

  private ArrayList<Rectangle2D> squares;

  private Rectangle2D current;

  /* ---------------------------------------------------[ MouseComponent ]--- */

  public MouseComponent() {
    squares = new ArrayList<Rectangle2D>();
    current = null;

    addMouseListener(new MouseHandler());
    addMouseMotionListener(new MouseMotionHandler());
  }

  /* ---------------------------------------------------[ paintComponent ]--- */

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    for (Rectangle2D r : squares) {
      g2.draw(r);
    }
  }

  /* -----------------------------------------------------[ MouseHandler ]--- */

  private class MouseHandler extends MouseAdapter {

    @Override
    public void mousePressed(MouseEvent e) {
      current = find(e.getPoint());
      if (current == null) add(e.getPoint());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      current = find(e.getPoint());
      if (current != null && e.getClickCount() >= 2) remove(current);
    }
  }

  /* -----------------------------------------------[ MouseMotionHandler ]--- */

  private class MouseMotionHandler implements MouseMotionListener {

    @Override
    public void mouseMoved(MouseEvent event) {
      if (find(event.getPoint()) == null) setCursor(Cursor.getDefaultCursor());
      else setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    }

    @Override
    public void mouseDragged(MouseEvent event) {
      if (current != null) {
        int x = event.getX();
        int y = event.getY();
        current.setFrame(x - SIDELENGTH / 2, y - SIDELENGTH / 2,
            SIDELENGTH, SIDELENGTH);
        repaint();
      }
    }
  }

  /* -------------------------------------------------------------[ find ]--- */

  public Rectangle2D find(Point2D p) {
    for (Rectangle2D r : squares) {
      if (r.contains(p)) return r;
    }
    return null;
  }

  /* --------------------------------------------------------------[ add ]--- */

  public void add(Point2D p) {
    double x = p.getX();
    double y = p.getY();

    current = new Rectangle2D.Double(x - SIDELENGTH / 2, y - SIDELENGTH / 2,
        SIDELENGTH, SIDELENGTH);
    squares.add(current);
    repaint();
  }

  /* -----------------------------------------------------------[ remove ]--- */

  public void remove(Rectangle2D s) {
    if (s == null) return;
    if (s == current) current = null;
    squares.remove(s);
    repaint();
  }

  /* -------------------------------------------------[ getPreferredSize ]--- */

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
  }
}