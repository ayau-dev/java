import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps6 extends Applet implements MouseListener {
    int x = 0, y = 0;

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 5, 5);
        g.drawString("X: " + x + " Y: " + y, 50, 50);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}