package Rok_3_21.ZD2;

public class Circle extends Shape{

    public Circle() {
        super();
    }

    @Override
    protected void drawShape() {
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    protected void playShapeSound() {
        System.out.println("Playing a sound specific for - " + getClass().getSimpleName());
    }

    @Override
    protected void eraseShape() {
        System.out.println("Erasing a " + getClass().getSimpleName());
    }

    @Override
    protected void translateShape() {
        System.out.println("Translating a: " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
