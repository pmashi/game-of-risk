package src.game;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class GamePanel extends JPanel {
    private Game game; 
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

    }

    public void paintComponent(Graphics2D g) { 
        super.paintComponent(g);
        game.render(g);
    }
}
