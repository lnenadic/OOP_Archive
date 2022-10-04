package Rok_3_21.ZD2;

public class AppTest2 {
    public static void main(String[] args) {
        Oval oval = new Oval();
        System.out.println(oval);
        System.out.println("---------------------------------------------------");
        oval.drawShape();
        oval.playShapeSound();
        oval.translateShape();
        oval.eraseShape();

        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("---------------------------------------------------");
        circle.drawShape();
        circle.playShapeSound();
        circle.translateShape();
        circle.eraseShape();

        System.out.println("*********");
        AUX_CLS.testAll(AUX_CLS.genShapes(2));
    }
}
