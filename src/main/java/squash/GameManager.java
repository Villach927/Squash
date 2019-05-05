package squash;

public class GameManager {
    private static GameManager gameManagerInstance = new GameManager();

    public static final int WIDTH = 640;
    public static final int HEIGHT = 960;

    private GameManager(){
        // Initialize
    }

    public static GameManager getInstance(){
        return gameManagerInstance;
    }
}
