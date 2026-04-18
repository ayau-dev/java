import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class taps4 extends Applet implements ActionListener {
    Button btn;
    int colorIndex = 0;

    public void init() {
        btn = new Button("Change Color");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        colorIndex = (colorIndex + 1) % 3;
        repaint();
    }

    public void paint(Graphics g) {
        if (colorIndex == 0) g.setColor(Color.RED);
        else if (colorIndex == 1) g.setColor(Color.GREEN);
        else g.setColor(Color.BLUE);

        g.fillOval(100, 50, 80, 80);
    }
}