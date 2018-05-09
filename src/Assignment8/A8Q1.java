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
    


    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1(){
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
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
		
        g.setColor(Color.WHITE);
        
        g.fillOval(175, 0, 450, 450);
        
        int[] PolyX = {200, 350, 450, 600};
        int[] PolyY = {300, 550, 550, 300};
        
        g.fillPolygon (PolyX, PolyY, 4);
        
        g.fillArc(275, 375, 150, 200, 150, 160);
        
        g.translate(525, 375);
        g2d.scale(-1,1);
        g.fillArc(0, 0, 150, 200, 150, 160);
        g2d.scale(-1,1);
        g.translate(-525, -375);
        
        //set colour
        g.setColor(Color.black);
        
        //draw a filled i rectangle
        //(x, y, width, height)
        g.fillOval(212, 181, 125, 50);
		
        //draw a filled i rectangle
        //(x, y, width, height)
        g.fillOval(463, 181, 125, 50);

       g.drawLine(400, 200, 400, 375);
        
        g.drawArc(325, 275, 150, 100, 180, 180);
        
        g.setColor(Color.red);
        
        /**
         * cos@ = x/r => x = x. + r * cos@
         * sin@ = y/r => y = y. + r * sin@
         * Math.cos();
         * Math.sin();
         * Math.toRadians();
         */
        
           int x = 0;
           int y = 0;
        
        for (int i = 5000; i > 0; i--) {
           

        }
        
        //draw anything that is an "oval"
        //(x, y, width, height)
	g.fillOval(250, 180, 50, 50);
        
        //draw anything that is an "oval"
        //(x, y, width, height)
	g.fillOval(500, 180, 50, 50);
        
        //draw an arc
        //(x, y, width, height, start angle, finish angle)
        g.fillArc(335, 375, 125, 100, 180, 180);
        
        g.setColor(Color.black);
        
        g.fillOval(262, 190, 25, 25);
        
        g.fillOval(512, 190, 25, 25);
        
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

