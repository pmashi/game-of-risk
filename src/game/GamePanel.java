package src.game;

import javax.swing.JPanel;

import src.input.MyMouseListener;

import java.awt.Dimension;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    private Game game; 
    private MyMouseListener mouseListener; 
    
    public static final int width = 1600; 
    public static final int height = 900;
    private Dimension size = new Dimension(width, height);

    public GamePanel(Game game) { 
        this.game = game; 
        setPanelSize();
    }

    public void setPanelSize() { 
        setMinimumSize(size);
        setMaximumSize(size);
        setPreferredSize(size);
    }
    
    public void initInputs() { 
        mouseListener = new MyMouseListener(game);

        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);
        setFocusable(true);
        requestFocus(); 
    }

    public void paintComponent(Graphics g) { 
        super.paintComponent(g);
        game.getRender().render(g);
    }
}
