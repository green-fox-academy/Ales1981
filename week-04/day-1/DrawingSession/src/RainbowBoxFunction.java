import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color colorIndigo = new Color(75, 0, 130);
        Color colorViolet = new Color(238, 130, 238);

        Color[] colors = { Color.red , Color.orange, Color.yellow, Color.green, Color.blue, colorIndigo, colorViolet};
        int size = 300;

        squares( size , colors , graphics);

    }

    private static void squares(int size, Color[] colors, Graphics graphics) {
        int count = 0;
        for ( int i = size ; i > 0 ; i=i-(size/ colors.length)){
            if( count < colors.length){
                graphics.setColor(colors[count]);
            }
            graphics.fillRect((WIDTH-i)/2, (WIDTH-i)/2, i, i);
            count++;
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