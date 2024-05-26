package src.scenes;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;

import src.game.Game;
import src.game.GamePanel;
import static src.game.GameStates.*;
import src.ui.Buttons;

public class Menu extends GameScene implements SceneMethods {
    private Buttons bPlay, bInstructions, bQuit; 
    private BufferedImage logo, background; 
    public static final Font firaCodeBold = new Font("FiraCode-Bold",Font.BOLD, 32);
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    
    public Menu(Game g) {
        super(g);
        initButtons(); 
    }
    
    public void initButtons() { 
        int width = 300;
		int height = width / 3;
		int x = GamePanel.width / 2 - width / 2;
		int y = 300;
		int yOffset = 150;

		bPlay = new Buttons("Play", x, y, width, height);
		bInstructions = new Buttons("Instruction", x, y + yOffset, width, height);
		bQuit = new Buttons("Quit", x, y + yOffset * 2, width, height);
    }

    public void render(Graphics g) {
        drawButtons(g); 
    }

    public void drawButtons(Graphics g){ 
        g.setFont(Menu.firaCodeBold);
		bPlay.draw(g);
		bInstructions.draw(g);
		bQuit.draw(g);
    }

    public void mouseClicked(int x, int y) {
        if(bPlay.getBounds().contains(x, y)) {
			setGameState(PLAYCREATE);
		} 
		else if (bInstructions.getBounds().contains(x,y))
		{
			setGameState(INSTRUCTIONS);
		}
		else if (bQuit.getBounds().contains(x, y))
		{
			System.exit(0);
		}
    }

    public void resetOver() {
        bPlay.setMouseOver(false);
        bInstructions.setMouseOver(false);
        bQuit.setMouseOver(false);
    }
    public void mouseMoved(int x, int y) {
        resetOver();
        if(bPlay.getBounds().contains(x, y)) { 
            bPlay.setMouseOver(true);
        } else if(bInstructions.getBounds().contains(x,y)) {
            bInstructions.setMouseOver(true);
        } else if(bQuit.getBounds().contains(x, y)) {
            bQuit.setMouseOver(false);
        }
    }

    public void mousePressed(int x, int y) {

    }

    public void mouseReleased(int x, int y) {

    }

    public void mouseDragged(int x, int y) {

    }
}
