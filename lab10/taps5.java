import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps5 extends Applet implements ActionListener {
    TextField xField, yField;
    Button btn;
    int x = 50, y = 50;

    public void init() {
        xField = new TextField(5);
        yField = new TextField(5);
        btn = new Button("Draw");

        add(xField);
        add(yField);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        x = Integer.parseInt(xField.getText());
        y = Integer.parseInt(yField.getText());
        repaint();
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 50, 50);
    }
}