package dayBreak_game;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Color skyBox = new Color(79, 182, 223);
    //tiles
    BufferedImage tile1 = loadImage("MainTile.png");
    BufferedImage tile1Under = loadImage("MainTile underside.png");
    Rectangle tileRect = new Rectangle(0, 0, 28, 28);
    //main character
    BufferedImage main1 = loadImage("Main Character stance.png");
    BufferedImage[] mainStance = new BufferedImage[10];
    BufferedImage main1OtherWay = loadImage("Main Character confused clone.png");
    BufferedImage[] mainStance2 = new BufferedImage[10];
    BufferedImage main1wlk = loadImage("Main Character walking clone.png");
    BufferedImage[] mainWalk = new BufferedImage[19];
    BufferedImage main2wlk = loadImage("Main Character walking.png");
    BufferedImage[] mainWalk2 = new BufferedImage[19];
    BufferedImage main1jmp = loadImage("Main Character jumping.png");
    BufferedImage[] mainJump1 = new BufferedImage[15];
    BufferedImage main2jmp = loadImage("Main Character jumping clone.png");
    BufferedImage[] mainJump2 = new BufferedImage[15];
    Rectangle main1Rect = new Rectangle(0, 675, 128, 128);
    
    //backgrounds
    BufferedImage bgSheet = loadImage("Stage1 back1.png");
    BufferedImage[] background = new BufferedImage[8];
    BufferedImage bg2Sheet = loadImage("stage2 back2.png");
    BufferedImage[] background2 = new BufferedImage[60];
    
    //ground enemies
    BufferedImage enemy1 = loadImage("Bat 1.png");
    BufferedImage[] bat1 = new BufferedImage[4];
    BufferedImage enemy2 = loadImage("soldier 1.png");
    BufferedImage[] soldier1 = new BufferedImage[2];
    BufferedImage enemy3 = loadImage("Alien 1.png");
    BufferedImage[] alien1 = new BufferedImage[3];
    BufferedImage enemy4 = loadImage("Robot1.png");
    BufferedImage[] robot1 = new BufferedImage[14];
    BufferedImage enemy5 = loadImage("soldier 1 attack.png");
    BufferedImage[] soldieratk1 = new BufferedImage[5];
    BufferedImage enemy6 = loadImage("soldier 1 walk.png");
    BufferedImage[] soldierwk1 = new BufferedImage[10];
    BufferedImage enemy7 = loadImage("Robot1 attack.png");
    BufferedImage[] robotatk1 = new BufferedImage[16];
    
    //bosses
    BufferedImage boss1 = loadImage("Gronk.png");
    BufferedImage[] gronk = new BufferedImage[2];
    Rectangle gronkRect = new Rectangle(0, 0, 225, 225);
    
    //projectiles
    BufferedImage mainBullet1 = loadImage("main bullet.png");
    BufferedImage[] MB = new BufferedImage[1];
    
    //main character
    boolean mainRight = false;
    boolean mainLeft = false;
    boolean mainJump = false;
    boolean mainFall = false;
    int mainStanceFrame = 0;
    int mainStance2Frame = 0;
    int mainWalk1Frame = 0;
    int mainWalk2Frame = 0;
    int mainJump1Frame = 0;
    int mainJump2Frame = 0;
    long lastMainStanceChange = 0;
    long lastMainStance2Change = 0;
    long lastMainWalk1Change = 0;
    long lastMainWalk2Change = 0;
    long lastMainJump1Change = 0;
    long lastMainJump2Change = 0;
    int mainStanceDelay = 50;
    int mainStance2Delay = 50;
    int mainWalk1Delay = 80;
    int mainWalk2Delay = 80;
    int mainJump1Delay = 50;
    int mainJump2Delay = 50;
    int mainWalkSpeed = 5;
    int mainFallSpeed = 10;
    
    //backgrounds
    int bgFrame = 0;
    int bg2Frame = 0;
    long lastBGChange = 0;
    long lastBG2Change = 0;
    int bgDelay = 83;
    int bg2Delay = 41;
    
    //ground enemies
    int bat1Frame = 0;
    int soldier1Frame = 0;
    int soldieratk1Frame = 0;
    int soldierwk1Frame = 0;
    int alien1Frame = 0;
    int robot1Frame = 0;
    int robotatk1Frame = 0;
    long lastBat1Change = 0;
    long lastsoldier1Change = 0;
    long lastsoldieratk1Change = 0;
    long lastsoldierwk1Change = 0;
    long lastAlien1Change = 0;
    long lastRobot1Change = 0;
    long lastRobotatk1Change = 0;
    int bat1Delay = 62;
    int soldier1Delay = 150;
    int soldieratk1Delay = 95;
    int soldierwk1Delay = 75;
    int alien1Delay = 120;
    int robot1Delay = 95;
    int robotatk1Delay = 100;
    
    //bosses
    int gronkFrame = 0;
    long lastGronkChange = 0;
    int gronkDelay = 250;
    int gronkJumpAngle = 45;
    int gronkJumpSpeed = 8;
    
    //projectiles
    boolean BfiredLeft = false;
    boolean Bfired = false;
    private Timer bulletTimer;
    int bulletCount = 0;
    int mainBulletFrame = 0;
    long lastMainBulletChange = 0;
    int mainBulletDelay = 0;
    int mainBulletSpeed = 12;
    Rectangle mainBFired = new Rectangle(0, 0, 6, 3);
    
    //player gravity
    int gravitySpeed = 5;
    int velocityY = 300;
    int vSpeed = 0;
    int playerVPosit = main1Rect.y;
    long startGravTimer = System.currentTimeMillis();
    Camera cam = new Camera(0, 0);
    // player x - camera x
    // platyer y - camera y
    int newCamPositX = 0;
    int newCamPositY = 0;

    //very basics of A* algorithym
//    [openList add:originalSquare]; // start by adding the original position to the open list
//do {
//	currentSquare = [openList squareWithLowestFScore]; // Get the square with the lowest F score
//	
//	[closedList add:currentSquare]; // add the current square to the closed list
//	[openList remove:currentSquare]; // remove it to the open list
//	
//	if ([closedList contains:destinationSquare]) { // if we added the destination to the closed list, we've found a path
//		// PATH FOUND
//		break; // break the loop
//	}
//	
//	adjacentSquares = [currentSquare walkableAdjacentSquares]; // Retrieve all its walkable adjacent squares
//	
//	foreach (aSquare in adjacentSquares) {
//		
//		if ([closedList contains:aSquare]) { // if this adjacent square is already in the closed list ignore it
//			continue; // Go to the next adjacent square
//		}
//		
//		if (![openList contains:aSquare]) { // if its not in the open list
//			
//			// compute its score, set the parent
//			[openList add:aSquare]; // and add it to the open list
//			
//		} else { // if its already in the open list
//			
//			// test if using the current G score make the aSquare F score lower, if yes update the parent because it means its a better path
//			
//		}
//	}
//	
//} while(![openList isEmpty]); // Continue until there is no more available square in the open list (which means there is no path)
//    
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

        //possible tile drawings?
//         for (int column = 0; column < bgSheet.getHeight(); column++) {
//                for (int row = 0; row < bgSheet.getWidth(); row++) {
//                  Raster tileBG1 = bgSheet.getTile(column, row);
//                  int x = column * bgSheet.getMinTileX();
//                  int y = row * bgSheet.getMinTileY();
//                //g.drawImage(tileBG1, x, y, null);
//            }  
//        }

        //backgrounds
        g.drawImage(background[bgFrame], 0, HEIGHT / 2 - 75, null);
        //g.drawImage(background2[bg2Frame], 0, 0, null);

        for (int row = 0; row < HEIGHT; row = row + tile1Under.getHeight()) {
            for (int column = 0; column > -WIDTH; column = column - tile1Under.getWidth()) {
                g.drawImage(tile1Under, column - cam.getX(), row, null);

            }
        }

        for (int column = 178; column < 400; column = column + tile1.getWidth()-1) {
                g.drawImage(tile1, column - cam.getX(), 475, null);
                column++;
            }

        if (Bfired == true) {
            g.drawImage(MB[mainBulletFrame], mainBFired.x - cam.getX(), mainBFired.y, null);
        }


        //main Character
        if (mainJump == true) {
            g.drawImage(mainJump1[mainJump1Frame], main1Rect.x - cam.getX(), main1Rect.y, null);
        } else {
            if (mainLeft == true) {
                g.drawImage(mainWalk[mainWalk1Frame], main1Rect.x - cam.getX(), main1Rect.y, null);
            } else if (mainRight == true) {
                g.drawImage(mainWalk2[mainWalk2Frame], main1Rect.x - cam.getX(), main1Rect.y, null);
            } else {
                g.drawImage(mainStance2[mainStance2Frame], main1Rect.x - cam.getX(), main1Rect.y, null);
            }

            if (mainJump == true) {
                g.drawImage(mainJump1[mainJump1Frame], main1Rect.x - cam.getX(), main1Rect.y, null);
            }
        }


        //ground enemies
        g.drawImage(bat1[bat1Frame], 0 - cam.getX(), 0, null);
        g.drawImage(soldier1[soldier1Frame], 35 - cam.getX(), 0, null);
        g.drawImage(alien1[alien1Frame], 70 - cam.getX(), 0, null);
        g.drawImage(robot1[robot1Frame], 105 - cam.getX(), 0, null);
        g.drawImage(soldieratk1[soldieratk1Frame], 140 - cam.getX(), 0, null);
        g.drawImage(soldierwk1[soldierwk1Frame], 175 - cam.getX(), 0, null);
        g.drawImage(robotatk1[robotatk1Frame], 210 - cam.getX(), 0, null);

        //bosses
        g.drawImage(gronk[gronkFrame], gronkRect.x - cam.getX(), gronkRect.y, null);

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

        //main character
        int widthMainStance = main1.getWidth() / 3;
        int heightMainStance = main1.getHeight() / 4;
        int i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                mainStance[i] = main1.getSubimage(col * widthMainStance, row * heightMainStance, widthMainStance, heightMainStance);
                i++;
                if (i == 10) {
                    break;
                }
            }
        }
        int widthMainStance2 = main1OtherWay.getWidth() / 3;
        int heightMainStance2 = main1OtherWay.getHeight() / 4;
        i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                mainStance2[i] = main1OtherWay.getSubimage(col * widthMainStance2, row * heightMainStance2, widthMainStance2, heightMainStance2);
                i++;
                if (i == 10) {
                    break;
                }
            }
        }
        int widthMainWalk1 = main1wlk.getWidth() / 4;
        int heightMainWalk1 = main1wlk.getHeight() / 5;
        i = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 4; col++) {
                mainWalk[i] = main1wlk.getSubimage(col * widthMainWalk1, row * heightMainWalk1, widthMainWalk1, heightMainWalk1);
                i++;
                if (i == 19) {
                    break;
                }
            }
        }
        int widthMainWalk2 = main2wlk.getWidth() / 4;
        int heightMainWalk2 = main2wlk.getHeight() / 5;
        i = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 4; col++) {
                mainWalk2[i] = main2wlk.getSubimage(col * widthMainWalk2, row * heightMainWalk2, widthMainWalk2, heightMainWalk2);
                i++;
                if (i == 19) {
                    break;
                }
            }
        }
        int widthMainJump1 = main1jmp.getWidth() / 4;
        int heightMainJump1 = main1jmp.getHeight() / 4;
        i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                mainJump1[i] = main1jmp.getSubimage(col * widthMainJump1, row * heightMainJump1, widthMainJump1, heightMainJump1);
                i++;
                if (i == 15) {
                    break;
                }
            }
        }
        int widthMainJump2 = main2jmp.getWidth() / 4;
        int heightMainJump2 = main2jmp.getHeight() / 4;
        i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                mainJump2[i] = main2jmp.getSubimage(col * widthMainJump2, row * heightMainJump2, widthMainJump2, heightMainJump2);
                i++;
                if (i == 15) {
                    break;
                }
            }
        }


        //backgrounds
        // splitting up the image spritesheet
        int width = bgSheet.getWidth() / 2;
        int height = bgSheet.getHeight() / 4;
        i = 0;
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


        //ground enemies
        int widthbat1 = enemy1.getWidth() / 2;
        int heightbat1 = enemy1.getHeight() / 2;
        i = 0;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                bat1[i] = enemy1.getSubimage(col * widthbat1, row * heightbat1, widthbat1, heightbat1);
                i++;
            }
        }
        int widthsoldier1 = enemy2.getWidth() / 1;
        int heightsoldier1 = enemy2.getHeight() / 2;
        i = 0;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 1; col++) {
                soldier1[i] = enemy2.getSubimage(col * widthsoldier1, row * heightsoldier1, widthsoldier1, heightsoldier1);
                i++;
            }
        }
        int widthAlien1 = enemy3.getWidth() / 2;
        int heightAlien1 = enemy3.getHeight() / 2;
        i = 0;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                alien1[i] = enemy3.getSubimage(col * widthAlien1, row * heightAlien1, widthAlien1, heightAlien1);
                i++;
                if (i == 3) {
                    break;
                }
            }
        }
        int widthRobot1 = enemy4.getWidth() / 4;
        int heightRobot1 = enemy4.getHeight() / 4;
        i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                robot1[i] = enemy4.getSubimage(col * widthRobot1, row * heightRobot1, widthRobot1, heightRobot1);
                i++;
                if (i == 14) {
                    break;
                }
            }
        }
        int widthSoldieratk1 = enemy5.getWidth() / 2;
        int heightSoldieratk1 = enemy5.getHeight() / 3;
        i = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                soldieratk1[i] = enemy5.getSubimage(col * widthSoldieratk1, row * heightSoldieratk1, widthSoldieratk1, heightSoldieratk1);
                i++;
                if (i == 5) {
                    break;
                }
            }
        }
        int widthSoldierwk1 = enemy6.getWidth() / 3;
        int heightSoldierwk1 = enemy6.getHeight() / 4;
        i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                soldierwk1[i] = enemy6.getSubimage(col * widthSoldierwk1, row * heightSoldierwk1, widthSoldierwk1, heightSoldierwk1);
                i++;
                if (i == 10) {
                    break;
                }
            }
        }
        int widthRobotatk1 = enemy7.getWidth() / 4;
        int heightRobotatk1 = enemy7.getHeight() / 4;
        i = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                robotatk1[i] = enemy7.getSubimage(col * widthRobotatk1, row * heightRobotatk1, widthRobotatk1, heightRobotatk1);
                i++;
            }
        }


        //bosses
        int widthGronk = boss1.getWidth() / 1;
        int heightGronk = boss1.getHeight() / 2;
        i = 0;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 1; col++) {
                gronk[i] = boss1.getSubimage(col * widthGronk, row * heightGronk, widthGronk, heightGronk);
                i++;
            }
        }

        //projectiles
        int widthMB = mainBullet1.getWidth() / 1;
        int heightMB = mainBullet1.getHeight() / 1;
        i = 0;
        for (int row = 0; row < 1; row++) {
            for (int col = 0; col < 1; col++) {
                MB[i] = mainBullet1.getSubimage(col * widthMB, row * heightMB, widthMB, heightMB);
                i++;
            }
        }

    }
    // The main game loop
    // In here is where all the logic for my game will go

    public void gameLoop() {

        cam.x = main1Rect.x - WIDTH / 2;

        moveGronk();
        movePlayer();
        bulletFired();
        gravity();

        //main character
        if (System.currentTimeMillis() > lastMainStanceChange + mainStanceDelay) {
            mainStanceFrame = (mainStanceFrame + 1) % mainStance.length;
            lastMainStanceChange = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastMainStance2Change + mainStance2Delay) {
            mainStance2Frame = (mainStance2Frame + 1) % mainStance2.length;
            lastMainStance2Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastMainWalk1Change + mainWalk1Delay) {
            mainWalk1Frame = (mainWalk1Frame + 1) % mainWalk.length;
            lastMainWalk1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastMainWalk2Change + mainWalk2Delay) {
            mainWalk2Frame = (mainWalk2Frame + 1) % mainWalk2.length;
            lastMainWalk2Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastMainJump1Change + mainJump1Delay) {
            mainJump1Frame = (mainJump1Frame + 1) % mainJump1.length;
            lastMainJump1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastMainJump2Change + mainJump2Delay) {
            mainJump2Frame = (mainJump2Frame + 1) % mainJump2.length;
            lastMainJump2Change = System.currentTimeMillis();
        }


        //backgrounds
        if (System.currentTimeMillis() > lastBGChange + bgDelay) {
            bgFrame = (bgFrame + 1) % background.length;
            lastBGChange = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastBG2Change + bg2Delay) {
            bg2Frame = (bg2Frame + 1) % background2.length;
            lastBG2Change = System.currentTimeMillis();
        }


        //ground enemies
        if (System.currentTimeMillis() > lastBat1Change + bat1Delay) {
            bat1Frame = (bat1Frame + 1) % bat1.length;
            lastBat1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastsoldier1Change + soldier1Delay) {
            soldier1Frame = (soldier1Frame + 1) % soldier1.length;
            lastsoldier1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastAlien1Change + alien1Delay) {
            alien1Frame = (alien1Frame + 1) % alien1.length;
            lastAlien1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastRobot1Change + robot1Delay) {
            robot1Frame = (robot1Frame + 1) % robot1.length;
            lastRobot1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastsoldieratk1Change + soldieratk1Delay) {
            soldieratk1Frame = (soldieratk1Frame + 1) % soldieratk1.length;
            lastsoldieratk1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastsoldierwk1Change + soldierwk1Delay) {
            soldierwk1Frame = (soldierwk1Frame + 1) % soldierwk1.length;
            lastsoldierwk1Change = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > lastRobotatk1Change + robotatk1Delay) {
            robotatk1Frame = (robotatk1Frame + 1) % robotatk1.length;
            lastRobotatk1Change = System.currentTimeMillis();
        }


        //bosses
        if (System.currentTimeMillis() > lastGronkChange + gronkDelay) {
            gronkFrame = (gronkFrame + 1) % gronk.length;
            lastGronkChange = System.currentTimeMillis();
        }


        //projectiles
        if (System.currentTimeMillis() > lastMainBulletChange + mainBulletDelay) {
            mainBulletFrame = (mainBulletFrame + 1) % MB.length;
            lastMainBulletChange = System.currentTimeMillis();
        }
    }

    private void movePlayer() {
        if (mainRight) {
            main1Rect.x = main1Rect.x + mainWalkSpeed;
        } else if (mainLeft) {
            main1Rect.x = main1Rect.x - mainWalkSpeed;

        }

        if (mainJump) {
            main1Rect.y = main1Rect.y - mainWalkSpeed;
        } else if (mainFall) {
            main1Rect.y = main1Rect.y + mainFallSpeed;
        }

        if (main1Rect.y < 0) {
            main1Rect.y = 0;
        } else if (main1Rect.y + main1Rect.height > HEIGHT) {
            main1Rect.y = HEIGHT - main1Rect.height;
        }
        if (main1Rect.x < 28) {
            main1Rect.x = tileRect.width;
        }
        if(main1Rect.intersects(tileRect)){
            main1Rect.y = main1Rect.y - tileRect.height;
        }
    }

    private void bulletFired() {
        if (Bfired) {
            if (!BfiredLeft) {
                mainBFired.x = mainBFired.x + mainBulletSpeed;
            } else {
                mainBFired.x = mainBFired.x - mainBulletSpeed;
            }
        }

//        if(mainBFired.x < cam.getX()){
//            break;
//        }else if(mainBFired.x > cam.getX()){
//            break;
//        }
    }

    private void moveGronk() {
        //jumping
        double newGronkJumpAngle = Math.toRadians(gronkJumpAngle);
        double moveX = (int) gronkJumpSpeed * Math.cos(newGronkJumpAngle);
        double moveY = (int) gronkJumpSpeed * Math.sin(newGronkJumpAngle);

        //makes him travel at different speeds
        //int randNumGronk = (int) (Math.random() * (1 -1 +1)) +1;

        gronkRect.x = gronkRect.x - (int) moveX;
        gronkRect.y = gronkRect.y - (int) moveY;

        //jumping collison
        if (gronkRect.y < 0) {
            gronkJumpAngle = gronkJumpAngle * -1;
        }
        if (gronkRect.y + gronkRect.height > HEIGHT) {
            gronkJumpAngle = gronkJumpAngle * -1;
        }

        if (gronkRect.intersects(tileRect)) {
            gronkJumpAngle = (180 + gronkJumpAngle * -1) % 360;
        }
    }

    private void gravity() {
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
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_D) {
                mainRight = true;
            } else if (keyCode == KeyEvent.VK_A) {
                mainLeft = true;
            }
            if (keyCode == KeyEvent.VK_W) {
                mainJump = true;
            }
            if (keyCode == KeyEvent.VK_W) {
                mainFall = false;
            }
            if (keyCode == KeyEvent.VK_SPACE) {
                Bfired = true;
                if (Bfired == true) {
                    BfiredLeft = false;
                    mainBFired.x = main1Rect.x + 120;
                    mainBFired.y = main1Rect.y + 80;
                }
                if (mainLeft == true) {
                    BfiredLeft = true;
                    mainBFired.x = main1Rect.x;
                    mainBFired.y = main1Rect.y + 80;
                }
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_D) {
                mainRight = false;
            } else if (keyCode == KeyEvent.VK_A) {
                mainLeft = false;
            }
            if (keyCode == KeyEvent.VK_W) {
                mainJump = false;
            }
            if (keyCode == KeyEvent.VK_W) {
                mainFall = true;
            }

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
