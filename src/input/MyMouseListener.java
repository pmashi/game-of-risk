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

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // System.out.println("hello");
        // System.out.println(GameStates.gameState);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }    
}
