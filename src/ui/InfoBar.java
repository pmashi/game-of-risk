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
    private boolean requiredAction; 
    
    public InfoBar(int x, int y, int w, int h, Play play) { 
        super(x, y, w, h); 
        this.play = play; 
        bitcoin = 0;
        income = 0; 
        day = 0; 
        requiredAction = false; 
    }

    public void draw(Graphics g) { 
        g.setColor(Color.gray);
        g.fillRect(x, y, width, height);
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);

        drawTitle(g);
        drawDayInfo(g);
        drawBitcoinInfo(g);
        drawRequiredAction(g);
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
        g.drawString("Income: " + income, x + 20, y + 140); 
    }

    public void drawRequiredAction(Graphics g) { 
        g.setColor(Color.black);
        g.setFont(Menu.firaCodeRegular);
        g.drawString("Required Action: ", x + 20, y + 190);
        
        int xpos = g.getFontMetrics().stringWidth("Required Actions: "); 
        g.drawRect(x + xpos + 20, y + 160, 30, 30);
        if(requiredAction) g.setColor(Color.green);
        else g.setColor(Color.red);
        g.fillRect(x + xpos + 20, y + 160, 30, 30);
    }

    public void passDay() { 
        if(day == 0) { 
            bitcoin += 50; 
            income += 50; 
        }
        day++; 
    }

    public void increaseIncome(int i) { 
        income += i; 
    }

    public void increaseBitcoin(int i) {
        bitcoin += i; 
    }

    public void spendBitcoin(int i) { 
        bitcoin -= i; 
    }

    public int getDay() { 
        return day; 
    }

    public int getBitcoin() { 
        return bitcoin;
    }

    public int getIncome() { 
        return income; 
    }

    public boolean getRequiredAction() {
        return requiredAction;
    }

    public void resetGame() { 
        bitcoin = 0; 
        day = 0; 
        income = 0; 
        requiredAction = false; 
    }
}
