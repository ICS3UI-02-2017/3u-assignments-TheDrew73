package dayBreak_game;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author watsa9604
 */
public class dayBreak extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 800;
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
    
    Color skyBox = new Color(79, 182, 255);
    
    //backgrounds
    BufferedImage bgSheet = loadImage("Stage1 back1.png");
    BufferedImage[] background = new BufferedImage[8];
    BufferedImage bg2Sheet = loadImage("1481561777kul.png");
    BufferedImage[] background2 = new BufferedImage[60];
    
    //enemies
    BufferedImage enemy1 = loadImage("Bat 5.png");
    BufferedImage[] bat5 = new BufferedImage[4];
    
    
    int bgFrame = 0;
    int bg2Frame = 0;
    int bat5Frame = 0;
    
    long lastBGChange = 0;
    long lastBG2Change = 0;
    long lastBat5Change = 0;
    
    int bgDelay = 83;
    int bg2Delay = 41;
    int bat5Delay = 62;
    
  

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public dayBreak() {
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
        preSetup();
        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    BufferedImage loadImage(String file) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE

        g.setColor(skyBox);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        //backgrounds
        g.drawImage(background[bgFrame], 0, HEIGHT / 2 - 75, null);
        g.drawImage(background2[bg2Frame], 0, 0, null);
        
        //enemies
        g.drawImage(bat5[bat5Frame], 350, 650, null);


        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

        //backgrounds
        // splitting up the image spritesheet
        int width = bgSheet.getWidth() / 2;
        int height = bgSheet.getHeight() / 4;
        int i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 2; col++) {
                background[i] = bgSheet.getSubimage(col * width, row * height, width, height);
                i++;
            }
        }

        int width2 = bg2Sheet.getWidth() / 5;
        int height2 = bg2Sheet.getHeight() / 12;
        i = 0;
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 5; col++) {
                background2[i] = bg2Sheet.getSubimage(col * width2, row * height2, width2, height2);
                i++;
            }
        }
        //enemies
        int widthbat5 = enemy1.getWidth() / 2;
        int heightbat5 = enemy1.getHeight() / 2;
        i = 0;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                bat5[i] = enemy1.getSubimage(col * widthbat5, row * heightbat5, widthbat5, heightbat5);
                i++;
            }
        }
    }

    // The main game loop
    // In here is where all the logic for my game will go
    
    //backgrounds
    public void gameLoop() {
        if (System.currentTimeMillis() > lastBGChange + bgDelay) {
            bgFrame = (bgFrame + 1) % background.length;
            lastBGChange = System.currentTimeMillis();
        }

        if (System.currentTimeMillis() > lastBG2Change + bg2Delay) {
            bg2Frame = (bg2Frame + 1) % background2.length;
            lastBG2Change = System.currentTimeMillis();
        }
        
        //enemies
        if (System.currentTimeMillis() > lastBat5Change + bat5Delay) {
            bat5Frame = (bat5Frame + 1) % bat5.length;
            lastBat5Change = System.currentTimeMillis();
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

        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        dayBreak game = new dayBreak();
    }
}
