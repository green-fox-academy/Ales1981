import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw at least 3 lines with that function using a loop.

        int startPointX = 50;
        int startPointY = 50;

        drawHorizontal(startPointX,startPointY,graphics);
        drawHorizontal(100, 100, graphics);
        drawHorizontal(100, 200, graphics);
        drawHorizontal(250, 130, graphics);

    }

    private static void drawHorizontal(int startPointX, int startPointY, Graphics graphics) {

        int lineLenght = 50;
        int yMargin = 25;

        for (int i = startPointX ; i <= startPointX ; i=i+lineLenght ) {
            for (int j = startPointY; j <= startPointY ; j=j+yMargin) {
                graphics.drawLine( i, j, i+lineLenght , j );
            }

        }
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
