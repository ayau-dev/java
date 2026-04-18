import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps10 extends Applet implements ItemListener {
    Checkbox red, green, blue;
    Color color = Color.BLACK;

    public void init() {
        red = new Checkbox("Red");
        green = new Checkbox("Green");
        blue = new Checkbox("Blue");

        add(red);
        add(green);
        add(blue);

        red.addItemListener(this);
        green.addItemListener(this);
        blue.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (red.getState()) color = Color.RED;
        else if (green.getState()) color = Color.GREEN;
        else if (blue.getState()) color = Color.BLUE;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(100, 50, 100, 100);
    }
}