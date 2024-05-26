package src.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import src.game.Game;
import src.game.GameStates;

public class MyMouseListener implements MouseListener, MouseMotionListener {
    private Game game; 
    public MyMouseListener(Game game) { 
        this.game = game; 
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        switch(GameStates.gameState) {
            case MENU: 
                game.getMenu().mouseDragged(e.getX(), e.getY());
                break; 
            case INSTRUCTIONS: 
                game.getInstructions().mouseDragged(e.getX(), e.getY());
                break; 
            case PLAYCREATE:
                game.getPlayCreate().mouseDragged(e.getX(), e.getY());
                break; 
            case PLAY: 
                game.getPlay().mouseDragged(e.getX(), e.getY());
                break; 
            case SHOP: 
                game.getShop().mouseDragged(e.getX(), e.getY());
                break; 
            case GAME_OVER: 
                game.getGameOver().mouseDragged(e.getX(), e.getY());
                break;
            default: 
                break; 
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        switch(GameStates.gameState) {
            case MENU: 
                game.getMenu().mouseMoved(e.getX(), e.getY());
                break; 
            case INSTRUCTIONS: 
                game.getInstructions().mouseMoved(e.getX(), e.getY());
                break; 
            case PLAYCREATE:
                game.getPlayCreate().mouseMoved(e.getX(), e.getY());
                break; 
            case PLAY: 
                game.getPlay().mouseMoved(e.getX(), e.getY());
                break; 
            case SHOP: 
                game.getShop().mouseMoved(e.getX(), e.getY());
                break; 
            case GAME_OVER: 
                game.getGameOver().mouseMoved(e.getX(), e.getY());
                break;
            default: 
                break; 
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + ", " + e.getY());
        switch(GameStates.gameState) {
            case MENU: 
                game.getMenu().mouseClicked(e.getX(), e.getY());
                break; 
            case INSTRUCTIONS: 
                game.getInstructions().mouseClicked(e.getX(), e.getY());
                break; 
            case PLAYCREATE:
                game.getPlayCreate().mouseClicked(e.getX(), e.getY());
                break; 
            case PLAY: 
                game.getPlay().mouseClicked(e.getX(), e.getY());
                break; 
            case SHOP: 
                game.getShop().mouseClicked(e.getX(), e.getY());
                break; 
            case GAME_OVER: 
                game.getGameOver().mouseClicked(e.getX(), e.getY());
                break;
            default: 
                break; 
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch(GameStates.gameState) {
            case MENU: 
                game.getMenu().mousePressed(e.getX(), e.getY());
                break; 
            case INSTRUCTIONS: 
                game.getInstructions().mousePressed(e.getX(), e.getY());
                break; 
            case PLAYCREATE:
                game.getPlayCreate().mousePressed(e.getX(), e.getY());
                break; 
            case PLAY: 
                game.getPlay().mousePressed(e.getX(), e.getY());
                break; 
            case SHOP: 
                game.getShop().mousePressed(e.getX(), e.getY());
                break; 
            case GAME_OVER: 
                game.getGameOver().mousePressed(e.getX(), e.getY());
                break;
            default: 
                break; 
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch(GameStates.gameState) {
            case MENU: 
                game.getMenu().mouseReleased(e.getX(), e.getY());
                break; 
            case INSTRUCTIONS: 
                game.getInstructions().mouseReleased(e.getX(), e.getY());
                break; 
            case PLAYCREATE:
                game.getPlayCreate().mouseReleased(e.getX(), e.getY());
                break; 
            case PLAY: 
                game.getPlay().mouseReleased(e.getX(), e.getY());
                break; 
            case SHOP: 
                game.getShop().mouseReleased(e.getX(), e.getY());
                break; 
            case GAME_OVER: 
                game.getGameOver().mouseReleased(e.getX(), e.getY());
                break;
            default: 
                break; 
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }    
}
