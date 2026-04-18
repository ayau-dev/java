import java.applet.Applet;
import java.awt.*;

public class taps1 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 60);
        g.drawString("Тіктөртбұрыш", 50, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Шеңбер", 200, 45);

        g.drawLine(50, 150, 200, 150);
        g.drawString("Сызық", 50, 170);
    }
}