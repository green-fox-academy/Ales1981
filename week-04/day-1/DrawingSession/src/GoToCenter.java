import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        int xPoint = 50;
        int yPoint = 50;
        graphics.setColor(Color.red);

        drawLines(xPoint, yPoint ,graphics);
        drawLines(30, 30 ,graphics);

    }

    private static void drawLines(int xPoint, int yPoint, Graphics graphics ) {


        for ( int x1  = xPoint ; x1 <= 3*xPoint; x1=x1+50 ){
            for ( int y1 = yPoint ; y1 <= 3*yPoint ; y1=y1+50) {
                graphics.drawLine( x1, y1, 160, 160);
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
