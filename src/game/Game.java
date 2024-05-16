package src.game;

import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {
    private GamePanel panel; 
    private GameRender render; 
    private Thread gameThread; 
    
    public static final int unit = 10; 
    private String players; 
    
    public static final double FPS = 60.0; 
    public static final double UPS = 60.0;

    public Game() {  
        panel = new GamePanel(this);
        this.setTitle("Game of Data"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(panel);
        pack(); 
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) { 
        new Game();
    }

    public void render(Graphics2D g) {

    }

    @Override
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
            default: 
            break; 
        }
    }
}
