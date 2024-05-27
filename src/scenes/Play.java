package src.scenes;

import java.awt.Graphics;

import src.game.Game;
import src.ui.InfoBar;

public class Play extends GameScene implements SceneMethods { 
    //ui 
    public InfoBar infoBar; 

    // game data
    private String weakness;
    private boolean[] stages = new boolean[5];
    private int day; 
    
    public Play(Game game) {
        super(game); 
        infoBar = new InfoBar(1300, 200, 200, 300, this);
    }

    public void update() { 

    }

    public void render(Graphics g) {
        infoBar.draw(g);
    }

    public void mouseClicked(int x, int y) {
    
    }

    public void mouseMoved(int x, int y) {
    
    }

    public void mousePressed(int x, int y) {

    }

    public void mouseReleased(int x, int y) {

    }

    public void mouseDragged(int x, int y) {

    }

    public void newGame() { 

    }

    public void randomWeakness() { 

    }

    public void resetStages() { 
        
    }

}
