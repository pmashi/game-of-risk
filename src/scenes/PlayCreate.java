package src.scenes;

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import src.game.Game;
import src.game.GamePanel;
import static src.game.GameStates.*; 
import src.ui.Buttons;

public class PlayCreate extends GameScene implements SceneMethods{
    private Buttons one_player, two_player; 
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
		int y = 200;
		int yOffset = 300;
        
        one_player = new Buttons("One Player", x, y, width, height);
        two_player = new Buttons("Two Players (Not Released)", x, y + yOffset, width, height);
        back = new Buttons("Back", 100, 100, 100, 100);
    }

    public void render(Graphics g) {
        drawButtons(g);
    }

    public void drawButtons(Graphics g) { 
        g.setFont(Menu.firaCodeBold);
        one_player.draw(g);
        two_player.draw(g);
        back.draw(g);
    } 

    public void mouseClicked(int x, int y) {
        if(back.getBounds().contains(x, y)) { 
            setGameState(MENU); 
        } else if(one_player.getBounds().contains(x, y)) { 
            setGameState(PLAY);
        } else if(two_player.getBounds().contains(x, y)) {
            System.out.println("Content not released");
        }
    }

    public void resetOver() { 
        back.setMouseOver(false);
        one_player.setMouseOver(false);
        two_player.setMouseOver(false);
    }

    public void mouseMoved(int x, int y) {
        resetOver();
        if(back.getBounds().contains(x, y)) { 
            back.setMouseOver(true);
        } else if(one_player.getBounds().contains(x, y)) { 
            one_player.setMouseOver(true);
        } else if(two_player.getBounds().contains(x, y)) {
            two_player.setMouseOver(true);
        }
    }

    public void mousePressed(int x, int y) {

    }

    public void mouseReleased(int x, int y) {

    }

    public void mouseDragged(int x, int y) {

    }
}
