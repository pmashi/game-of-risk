package src.ui;

import java.awt.Color;
import java.awt.Graphics;

import src.scenes.Menu;
import src.scenes.Play;

public class InfoBar extends Bar{
    private Play play; 

    private int bitcoin; 
    private int income; 
    private int day; 
    
    public InfoBar(int x, int y, int w, int h, Play play) { 
        super(x, y, w, h); 
        this.play = play; 
        bitcoin = 0;
        day = 0; 
    }

    public void draw(Graphics g) { 
        g.setColor(Color.gray);
        g.fillRect(x, y, width, height);
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);

        drawTitle(g);
        drawDayInfo(g);
        drawBitcoinInfo(g);
        // drawButtons(g);
    }

    public void drawTitle(Graphics g) { 
        g.setColor(Color.black);
        g.setFont(Menu.firaCodeBold);
        g.drawString("Info Bar", x + 40, y - 10);
    }

    public void drawDayInfo(Graphics g) { 
        g.setColor(Color.black);
        g.setFont(Menu.firaCodeRegular);
        g.drawString("Day: " + day, x + 20, y + 40); 
    } 

    public void drawBitcoinInfo(Graphics g) { 
        g.setColor(Color.black);
        g.setFont(Menu.firaCodeRegular);
        g.drawString("Bitcoin: " + bitcoin, x + 20, y + 90);
        g.drawString("Income: ", x + 20, y + 140); 
    }

    public void mouseClicked(int x, int y) { 
        
    }

    public void mouseMoved(int x, int y) { 

    }

    public void mousePressed(int x, int y) { 

    }

    public void mouseReleased(int x, int y) { 

    }
}
