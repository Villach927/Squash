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
    }
}
