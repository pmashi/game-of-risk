package src.game;

import src.scenes.*;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {
    private GamePanel panel; 
    private GameRender render; 
    private Thread gameThread; 
    
    private Menu menu; 
    private Instructions instructions; 
    private PlayCreate playCreate; 
    private Play play; 
    // private Shop shop; 
    private GameOver gameOver; 
    
    public static final int unit = 10; 
    
    public static final double FPS = 60.0; 
    public static final double UPS = 60.0;

    public static void main(String[] args) { 
        // System.out.println("Starting...");
        Game game = new Game();
        game.panel.initInputs();
        game.start(); 
    }

    public Game() {  
        initClasses();

        panel = new GamePanel(this);
        this.setTitle("Data Breach: The Cyber Offensive"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(panel);
        pack(); 
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initClasses() { 
        render = new GameRender(this);
        menu = new Menu(this);
        instructions = new Instructions(this);
        playCreate = new PlayCreate(this);
        play = new Play(this);
        // shop = new Shop(this);
        gameOver = new GameOver(this);
    }

    public void start() {
        gameThread = new Thread(this){};
        gameThread.start(); 
    }

    public void run() {
        long lastFrame = System.nanoTime();
		long lastUpdate = System.nanoTime();
		long lastTimeCheck = System.currentTimeMillis();
		long current;
		double timePerFrame = 1000000000.0 / FPS;
		double timePerUpdate = 1000000000.0 / UPS;
		int frames = 0;
		int updates = 0;
		while (true) {
			current = System.nanoTime(); 
			if (current - lastFrame >= timePerFrame) {
				repaint();
				lastFrame = current;
				frames++;
			}
			if (current - lastUpdate >= timePerUpdate) {
				updateGame();
				lastUpdate = current;
				updates++;
			}
			if (System.currentTimeMillis() - lastTimeCheck >= 1000) {
//				System.out.println("FPS: " + frames + " | UPS: " + updates);
				frames = 0;
				updates = 0;
				lastTimeCheck = System.currentTimeMillis();
			}
		}
    }

    public void updateGame() { 
        switch (GameStates.gameState) { 
            case MENU: 
            break;
            case INSTRUCTIONS:
            break;  
            case PLAYCREATE:
            break;
            case PLAY: 
            play.update(); 
            // case SHOP: 
            // break; 
            case GAME_OVER:
            break;
            default: 
            break; 
        }
    }

    public GameRender getRender(){ 
        return render; 
    }

    public Menu getMenu() { 
        return menu; 
    }

    public Instructions getInstructions() {
        return instructions; 
    }

    public PlayCreate getPlayCreate() {
        return playCreate;
    }

    public Play getPlay() { 
        return play; 
    }

    // public Shop getShop() { 
    //     return shop; 
    // }

    public GameOver getGameOver() { 
        return gameOver; 
    }
}
