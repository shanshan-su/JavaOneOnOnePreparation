package classes;

public abstract class GraphicObject {
    public int x;
    public int y;

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public abstract void draw();
    protected abstract void resize();
}
