package Rok_3_21.ZD2;

public abstract class Shape {

    protected static int cntShop = 10;
    protected int id;

    public Shape() {
        this.id = cntShop++;
    }

    protected abstract void drawShape();
    protected abstract void playShapeSound();
    protected abstract void eraseShape();
    protected abstract void translateShape();

    @Override
    public String toString() {
        String cls = getClass().getSimpleName();
        return cls + " - Shape {" +
                "id=" + id +
                '}';
    }
}
