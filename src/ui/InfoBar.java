package src.ui;

import java.awt.Graphics;

import src.scenes.Menu;
import src.scenes.Play;

public class InfoBar extends Bar{
    private Play play; 
    private Buttons menu, shop; 

    private int bitcoin; 
    private int income; 
    private int day; 
    
    
    public InfoBar(int x, int y, int w, int h, Play play) { 
        super(x, y, w, h); 
        this.play = play; 
        bitcoin = 0;
        day = 0; 
    }

    public void initButtons() {
        menu = new Buttons("Menu", x, y, width, height);
        shop = new Buttons("Shop", x, y, width, height);
    }

    public void draw(Graphics g) { 
        g.setFont(Menu.firaCodeBold);
    }

    public void drawDayInfo(Graphics g) { 
        g.drawString("Day: " + day, x, y); 
    } 

    public void drawBitcoinInfo(Graphics g) { 
        g.setFont(Menu.firaCodeRegular);
        g.drawString("Bitcoin: " + bitcoin, x, y + 50);
        g.drawString("Income: ", x, y + 100); 
    }

    public void drawButtons(Graphics g) { 

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
