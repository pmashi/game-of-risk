package src.ui;

import java.awt.Graphics;

import src.scenes.Menu;
import src.scenes.Play;

public class InteractionBar extends Bar {
    private Play play; 
    private Buttons log, shop, endDay;
    public InteractionBar(int x, int y, int w, int h, Play play) { 
        super(x, y, w, h); 
        this.play = play; 
        initButtons();
    }

    public void draw(Graphics g) { 
        
        drawButtons(g);
    }

    public void drawButtons(Graphics g) { 
        g.setFont(Menu.robotoMono);
        log.draw(g);
        shop.draw(g);
        endDay.draw(g);
    }
    
    public void initButtons() { 
        int xOffset = 300; 
        int w = 200; 
        int h = 100; 
        log = new Buttons("Logs", x, y, w, h);
        shop = new Buttons("Shop", x + xOffset, y, w, h); 
        endDay = new Buttons("End Day", x + xOffset * 2, y, w, h);
    }

    public void mouseClicked(int x, int y) { 
        if(log.getBounds().contains(x, y)) { 

        } else if(shop.getBounds().contains(x, y)) { 

        } else if(endDay.getBounds().contains(x, y)) { 

        }
    }

    public void resetOver() { 
        log.setMouseOver(false);
        shop.setMouseOver(false);
        endDay.setMouseOver(false);
    }

    public void mouseMoved(int x, int y) { 
        resetOver();
        if(log.getBounds().contains(x, y)) { 
            log.setMouseOver(true);
        } else if(shop.getBounds().contains(x, y)) { 
            shop.setMouseOver(true);
        } else if(endDay.getBounds().contains(x, y)) { 
            endDay.setMouseOver(true);
        }
    }

    public void mousePressed(int x, int y) { 

    } 
    
    public void mouseReleased(int x, int y) { 

    }

}
