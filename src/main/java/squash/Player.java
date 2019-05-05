package squash;

public class Player {
    public static final int SIZE = 10;
    public static final int DEFAULT_X = 100, DEFAULT_Y = 500;
    private int x, y;

    public Player() {
        this.setX(DEFAULT_X);
        this.setY(DEFAULT_Y);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
