package src.game;

public enum GameStates {
    MENU, INSTRUCTIONS, PLAYCREATE, PLAY, SHOP, GAME_OVER;

    public static GameStates gameState = MENU; 

    public static void setGameState(GameStates state) { 
        gameState = state; 
    } 
}
