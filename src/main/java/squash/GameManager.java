package squash;

public class GameManager {
    private static GameManager gameManagerInstance = new GameManager();

    private GameManager(){
        // Initialize
    }

    public static GameManager getInstance(){
        return gameManagerInstance;
    }
}
