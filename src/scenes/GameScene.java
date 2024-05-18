package src.scenes;

import src.game.Game;

public class GameScene {

    protected Game game; 

    public GameScene(Game g) { 
        game = g; 
    }

    public Game getGame() { 
        return game; 
    }
}
