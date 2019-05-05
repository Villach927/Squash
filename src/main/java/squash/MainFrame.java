package squash;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame mainFrameInstance = new MainFrame();

    private MainFrame(){
        this.setTitle("Squash");
        this.setVisible(true);

        this.getContentPane().setPreferredSize(new Dimension(GameManager.WIDTH, GameManager.HEIGHT));
        this.getContentPane().add(new MainPanel());
        this.pack();

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static MainFrame getInstance(){
        return mainFrameInstance;
    }
}
