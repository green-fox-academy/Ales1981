import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Color firstColor = Color.red ;
        int startX = 50;
        int startY = 50;
        int sizeA = 50;
        int sizeB = 75;

        drawRectangle( startX , startY, sizeA , sizeB , firstColor , graphics);
        drawRectangle( 120 , 150, 60 , 60 , Color.BLUE , graphics);
        drawRectangle( 10 , 15, 10 , 200 , Color.green , graphics);
        drawRectangle( 250 , 150, 100 , 100 , Color.yellow , graphics);


    }

    private static void drawRectangle(int startX, int startY, int sizeA, int sizeB, Color firstColor, Graphics graphics) {

        graphics.setColor(firstColor);
        graphics.fillRect(startX, startY, sizeA, sizeB);


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
