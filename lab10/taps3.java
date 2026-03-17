import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps3 extends Applet implements ActionListener {
    TextField tf;
    Button btn;
    String msg = "";

    public void init() {
        tf = new TextField(15);
        btn = new Button("OK");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "Сәлем, " + tf.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}