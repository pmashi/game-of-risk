package src.scenes;

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import src.game.Game;
import src.game.GamePanel;
import static src.game.GameStates.*; 
import src.ui.Buttons;

public class PlayCreate extends GameScene implements SceneMethods{
    private Buttons[] players = new Buttons[2]; 
    private Buttons back; 
    private int playerSelect = 0; 
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

    public PlayCreate(Game game) {
        super(game); 
        initButtons(); 
    }

    public void initButtons() { 
        int width = 450;
		int height = width / 3;
		int x = GamePanel.width / 2 - width / 2;
		int y = 300;
		int yOffset = 400;
        
        for(int i = 0; i < players.length; i++) { 
            players[i] = new Buttons(((i+1)+" Player"+(i!=0?"s":"")), x, y + yOffset * i, width, height);     
        }
        back = new Buttons("Back", 100, 100, 100, 100);
    }

    public void render(Graphics g) {
        drawButtons(g);
    }

    public void drawButtons(Graphics g) { 
        for(int i =0 ; i < players.length; i++) { 
            players[i].draw(g);
        }
        back.draw(g);
    } 

    public void mouseClicked(int x, int y) {
        if(back.getBounds().contains(x, y)) { 
            setGameState(MENU); 
        } 
        for(int i = 0; i < players.length; i++) {
            if(players[i].getBounds().contains(x, y)) {
                game.getPlay().setPlayers(i+1);
                setGameState(PLAY);
            }
        }
    }

    public void resetOver() { 
        back.setMouseOver(false);
        for(int i =0; i< players.length; i++) {
            players[i].setMouseOver(false);
        }
    }
    public void mouseMoved(int x, int y) {
    
    }

    public void mousePressed(int x, int y) {

    }

    public void mouseReleased(int x, int y) {

    }

    public void mouseDragged(int x, int y) {

    }
}
