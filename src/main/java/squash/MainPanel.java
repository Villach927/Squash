package squash;

import javax.swing.*;

public class MainPanel extends JPanel {
    private static MainPanel mainPanelInstance = new MainPanel();

    private MainPanel() {
    }

    public static MainPanel getInstance() {
        return mainPanelInstance;
    }
}
