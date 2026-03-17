import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps7 extends Applet implements KeyListener {
    char ch = ' ';

    public void init() {
        addKeyListener(this);
        setFocusable(true);
    }

    public void keyTyped(KeyEvent e) {
        ch = e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Символ: " + ch, 50, 100);
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}