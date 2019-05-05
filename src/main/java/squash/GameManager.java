package squash;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameManager implements KeyListener {
    public enum PHASE {
        TITLE,
        PLAY,
        RESULT,
    }

    private static GameManager gameManagerInstance = new GameManager();

    public static final int WIDTH = 640;
    public static final int HEIGHT = 960;

    public PHASE gamePhase;

    public Player player;

    private GameManager() {
        // Initialize
        this.setUp();
    }

    public static GameManager getInstance() {
        return gameManagerInstance;
    }

    private void setUp() {
        this.gamePhase = PHASE.TITLE;
    }

    private void startPlay() {
        player = new Player();
        MainPanel.getInstance().repaint();
    }

    private void proceedPhase() {
        if(this.gamePhase == PHASE.TITLE){
            this.gamePhase = PHASE.PLAY;
            this.startPlay();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_ENTER){
            this.proceedPhase();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
