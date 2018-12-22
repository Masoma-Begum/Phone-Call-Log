package mobileInfoManagementsystem;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javafx.scene.paint.Color;
import javax.swing.JPanel;

public class SlideText extends JPanel {

    int x = 0, y = 60;

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Tahoma", Font.BOLD + Font.PLAIN, 100);
        g2.setFont(font);
        g2.setColor(java.awt.Color.decode("0xFF0096"));
        g2.drawString("EAST", x, y);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (x > this.getWidth()) {
            x = 0;
        }
        repaint();
    }
}
