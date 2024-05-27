package src.game;

import java.awt.Graphics;

public class GameRender {
    private Game game; 

    public GameRender(Game game) { 
        this.game = game; 
    }

    public void render(Graphics g) { 
        switch(GameStates.gameState)
		{
		case MENU:
			game.getMenu().render(g);
			break;
        case INSTRUCTIONS: 
            game.getInstructions().render(g);
            break;
        case PLAYCREATE:
            game.getPlayCreate().render(g);
            break;
		case PLAY:
			game.getPlay().render(g);
			break;
        // case SHOP:
        //     game.getShop().render(g);
        //     break;
		case GAME_OVER:
			game.getGameOver().render(g);
			break;
		default: 
			break;
		}
    }
}
