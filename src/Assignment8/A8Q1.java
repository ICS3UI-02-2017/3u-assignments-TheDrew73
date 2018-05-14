package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author watsa9604
 */
public class A8Q1 extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    
    //custom colors
    Color shading = new Color(244, 244, 244);
    Color tV = new Color(0, 22, 58);
    Color brown = new Color(38, 26, 0);
    
    int eyesVib = 250;
    
    int eyesVib2 = 500;
    
    int mouseX = 0;
    int mouseY = 0;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE

        //create tv background
        g.setColor(brown);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.fillRoundRect(37, 10, 725, 560, 90, 90);
        g.setColor(tV);
        g.fillRoundRect(50, 15, 700, 550, 90, 90);
        
        g.setColor(Color.BLACK);
        for (int i = 17; i < 563; i = i + 12) {
            g.drawLine(50, i, 750, i);
        }

        //create the basic shapes in the face
        g.setColor(Color.WHITE);
        g.fillOval(170, 150, 50, 100);
        g.fillOval(580, 150, 50, 100);
        g.fillOval(150, 250, 150, 150);
        g.fillOval(500, 250, 150, 150);
        g.fillOval(175, 0, 450, 450);
        
        int[] PolyX = {200, 350, 450, 600};
        int[] PolyY = {300, 550, 550, 300};
        g.fillPolygon(PolyX, PolyY, 4);

        g.fillArc(275, 375, 150, 200, 150, 160);

        g.translate(525, 375);
        g2d.scale(-1, 1);
        g.fillArc(0, 0, 150, 200, 150, 160);
        g2d.scale(-1, 1);
        g.translate(-525, -375);

        //drawing minor details
        g.setColor(Color.black);
        g.drawArc(200, 125, 150, 50, 0, 180);
        g.drawArc(450, 125, 150, 50, 0, 180);
        g.drawLine(350, 473, 320, 566);
        g.drawLine(450, 473, 480, 566);
        g.drawLine(350, 473, 350, 450);

        //draw a filled i rectangle
        //(x, y, width, height)
        g.fillOval(212, 156, 125, 75);

        //draw a filled i rectangle
        //(x, y, width, height)
        g.fillOval(463, 156, 125, 75);

        g.drawLine(400, 200, 400, 375);
        g.drawArc(325, 275, 150, 100, 180, 180);

        //create the spirals
        g.setColor(Color.red);

        /**
         * cos@ = x/r => x = x. + r * cos@ 
         * sin@ = y/r => y = y. + r * sin@
         * Math.cos(); Math.sin(); Math.toRadians();
         */
        int prevX = 225;
        int prevY = 325;
        double a = 0;
        double r = 0;

        while (r <= 75) {
            r += 0.3;
            int x = (int) (225 + r * Math.cos(a));
            int y = (int) (325 + r * Math.sin(a));
            g.drawLine(prevX, prevY, x, y);
            prevX = x;
            prevY = y;
            a += 0.1;
        }

        int prevX2 = 575;
        int prevY2 = 325;
        double a2 = 0;
        double r2 = 0;
        while (r2 <= 75) {
            r2 += 0.3;
            int x2 = (int) (575 + r2 * Math.cos(a2));
            int y2 = (int) (325 + r2 * Math.sin(a2));
            g.drawLine(prevX2, prevY2, x2, y2);
            prevX2 = x2;
            prevY2 = y2;
            a2 += 0.1;
        }

        //eyes and the mouth
        //draw anything that is an "oval"
        //(x, y, width, height)
        g.fillOval(eyesVib, 165, 50, 50);

        //draw anything that is an "oval"
        //(x, y, width, height)
        g.fillOval(eyesVib2, 165, 50, 50);

        g.fillRect(350, 435, 100, 25);

        int[] mouthCorner1X = {300, 350, 350};
        int[] mouthCorner1Y = {400, 435, 475};
        int[] mouthCorner2X = {500, 450, 450};
        int[] mouthCorner2Y = {400, 435, 475};

        g.fillPolygon(mouthCorner2X, mouthCorner2Y, 3);
        g.fillPolygon(mouthCorner1X, mouthCorner1Y, 3);

        //eyes and more minor details
        g.setColor(Color.black);
        g.drawLine(350, 473, 350, 450);
        g.drawLine(350, 450, 450, 450);
        g.drawLine(450, 473, 450, 450);
        
        double angle = Math.atan2(mouseX, mouseY);
        double y4 = 25 * Math.sin(angle);
        double x4 = 25 * Math.cos(angle);
        int x_1 = (int)(mouseX + x4);
        int y_1 = (int)(mouseY + y4);
        
        g.fillOval(mouseX, mouseY, 25, 25);
        g.fillOval(mouseX, mouseY, 25, 25);
        g.drawOval(150, 250, 150, 150);
        g.drawOval(500, 250, 150, 150);

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        
        eyesVib = eyesVib + 3;
        if(eyesVib > 255){
            eyesVib = 250;
        }
        
        eyesVib2 = eyesVib2 + 3;
        if(eyesVib2 > 505){
            eyesVib2 = 500;
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
            //set the mouse location
            mouseX = e.getX();
            mouseY = e.getY();
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1 game = new A8Q1();
    }
}
