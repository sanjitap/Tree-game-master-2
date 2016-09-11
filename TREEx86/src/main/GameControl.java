package main;

/**
 *
 * @author Kenneth
 */
public class GameControl {
    enum GameState {
        INITIALIZING,
        TITLE,
        PLAYING,
        PAUSED,
        ENDING,
    }
    private GameState gameState;
    private static GameControl singleton;
    private GameControl(){
        this.gameState = GameState.INITIALIZING;
    }
    public void init(){
        //TODO: initialize the JFrame
        
    }
    public void start(){
        
    }
    public static GameControl getInstance(){
        if(singleton == null){
            singleton = new GameControl();
        }
        return singleton;
    }
}
