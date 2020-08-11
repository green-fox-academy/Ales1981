import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        int size = 50;

        drawCenteredSquares( size , graphics);
        drawCenteredSquares( 100 , graphics);
        drawCenteredSquares( 200 , graphics);
        //drawCenteredSquares( 300 , graphics);



    }

    private static void drawCenteredSquares(int size, Graphics graphics) {

        int positionX = (WIDTH/2) - ( size/2);
        int positionY = (HEIGHT/2) - ( size/2);

        graphics.drawRect(positionX, positionY, size, size);
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
