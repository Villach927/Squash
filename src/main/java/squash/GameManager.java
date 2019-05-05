package squash;

public class GameManager {
    private enum PHASE {
        TITLE,
        PLAY,
        RESULT,
    }

    private static GameManager gameManagerInstance = new GameManager();

    public static final int WIDTH = 640;
    public static final int HEIGHT = 960;

    public PHASE gamePhase;

    private GameManager(){
        // Initialize
        this.setUp();
    }

    public static GameManager getInstance(){
        return gameManagerInstance;
    }

    private void setUp(){
        this.gamePhase = PHASE.TITLE;
    }
}
