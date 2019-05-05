package squash;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private static MainPanel mainPanelInstance = new MainPanel();

    private MainPanel() {
    }

    public static MainPanel getInstance() {
        return mainPanelInstance;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        GameManager manager = GameManager.getInstance();

        if(manager.gamePhase == GameManager.PHASE.PLAY) {
            Player player = manager.player;
            graphics.fillRect(player.getX(), player.getY(), player.SIZE, player.SIZE);
        }
    }
}
