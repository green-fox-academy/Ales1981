import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(Color.red);
        graphics.drawLine(100, 100, 200, 100);
        graphics.setColor(Color.yellow);
        graphics.drawLine(100, 100, 100, 200);
        graphics.setColor(Color.blue);
        graphics.drawLine(100, 200, 200, 200);
        graphics.setColor(Color.green);
        graphics.drawLine(200, 200, 200, 100);
        graphics.setColor(Color.pink);
        graphics.drawLine(100, 100, 150, 50);
        graphics.setColor(Color.black);
        graphics.drawLine(200, 100, 250, 50);
        graphics.setColor(Color.CYAN);
        graphics.drawLine(150, 50, 250, 50);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(200, 200, 250, 150);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(250, 150, 250, 50);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
