import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps8 extends Applet implements ActionListener {
    TextField tf1, tf2;
    Button btn;
    int result = 0;

    public void init() {
        tf1 = new TextField(5);
        tf2 = new TextField(5);
        btn = new Button("+");

        add(tf1);
        add(tf2);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        result = a + b;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Нәтиже: " + result, 50, 100);
    }
}