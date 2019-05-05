package squash;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameManager implements KeyListener, Runnable{
    public enum PHASE {
        TITLE,
        PLAY,
        RESULT,
    }

    private static GameManager gameManagerInstance = new GameManager();

    public static final int WIDTH = 640;
    public static final int HEIGHT = 960;

    public static final int INTERVAL = 10; //スレッド実行時のインターバル．ミリ秒単位で指定．

    public PHASE gamePhase;

    public Player player;

    private GameManager() {
        // Initialize
        this.setUp();
        Thread th = new Thread(this);
        th.start();
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
        this.gamePhase = PHASE.PLAY;
    }

    private void proceedPhase() {
        if(this.gamePhase == PHASE.TITLE) {
            this.startPlay();
        }
    }

    @Override
    public void run() {
        while(true){
            MainPanel.getInstance().repaint();

            try {
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_ENTER) {
            this.proceedPhase();
        }
        if(this.gamePhase == PHASE.PLAY) {
            if(key == KeyEvent.VK_LEFT) {
                this.player.toLeft();
            }else if(key == KeyEvent.VK_RIGHT) {
                this.player.toRight();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
