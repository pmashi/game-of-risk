package src.ui;

import java.awt.Graphics;

import src.scenes.Play;

public class TaskBar extends Bar {
    
    private Play play; 
    private boolean[] tasks = new boolean[5];

    public TaskBar(int x, int y, int w, int h, Play play) { 
        super(x, y, w, h);
        this.play = play; 
    }

    public void draw(Graphics g) { 

    }

    public void drawList(Graphics g) { 
        
    }
    
}
