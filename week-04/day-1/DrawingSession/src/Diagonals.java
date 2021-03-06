import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        int firstX = 0;
        int firstY = 0;
        int secondX = 320;
        int secondY = 320;

        drawDiagonal( firstX , firstY , secondX, secondY , graphics );
        drawDiagonal( 320 , 0 , 0, 320 , graphics);

    }

    private static void drawDiagonal(int firstX, int firstY, int secondX, int secondY, Graphics graphics) {

        Color mainColor = Color.green;
        Color diagonalColor = Color.red;

        graphics.drawLine(firstX, firstY, secondX, secondY);
        if (firstX != 320 ) {
            graphics.setColor(diagonalColor);
        }
        else {
            graphics.setColor(mainColor);
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
