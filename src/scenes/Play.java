package src.scenes;

import java.awt.Graphics;

import src.game.Game;
import src.ui.InfoBar;
import src.ui.InteractionBar;
import src.ui.TaskBar;

public class Play extends GameScene implements SceneMethods { 
    //ui 
    public InfoBar infoBar; 
    public TaskBar taskBar; 
    public InteractionBar interactionBar; 

    // game data
    private String weakness;
    private boolean[] stages = new boolean[5];
    private int day; 
    
    public Play(Game game) {
        super(game); 
        infoBar = new InfoBar(1100, 100, 400, 250, this);
        taskBar = new TaskBar(1100, 500, 400, 700, this);
        interactionBar = new InteractionBar(100, 700, 1000, 400, this);
    }

    public void update() { 

    }

    public void render(Graphics g) {
        infoBar.draw(g);
        taskBar.draw(g);
        interactionBar.draw(g);
    }

    public void mouseClicked(int x, int y) {
        interactionBar.mouseClicked(x, y);
    }

    public void mouseMoved(int x, int y) {
        interactionBar.mouseMoved(x, y);
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
