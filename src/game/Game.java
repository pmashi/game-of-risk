package src.game;

import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Game extends JFrame {
    private GamePanel panel; 
    public static final int unit = 10; 
    private String players; 
    
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
}
