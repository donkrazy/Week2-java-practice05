package prob5;

public abstract class Unit {
    // 현재 위치
    private int x;
    private int y;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void move(int x, int y);
    public abstract void stop();
}
