import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps2 extends Applet implements ActionListener {
    Button btn;
    String text = "";

    public void init() {
        btn = new Button("Click");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = "Hello Java";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 100);
    }
}