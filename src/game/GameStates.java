package src.game;

public enum GameStates {
    MENU, PLAY, GAME_OVER;

    public static GameStates gameState = MENU; 

    public static void setGameState(GameStates state) { 
        gameState = state; 
    } 
}
