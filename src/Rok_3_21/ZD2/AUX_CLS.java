package Rok_3_21.ZD2;

import java.util.ArrayList;
import java.util.Random;

public class AUX_CLS {

    private static final String[] ARR_SHP = {"Oval", "Circle"};

    public static ArrayList<Shape> genShapes(int num) {

        ArrayList<Shape> shapes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            String var = ARR_SHP[random.nextInt(ARR_SHP.length)];
            switch (var) {
                case "Oval":
                    shapes.add(new Oval());
                    break;
                case "Circle":
                    shapes.add(new Circle());
                    break;

            }
        }

        return shapes;
    }

    public static void testAll(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("*******************");
            shape.drawShape();
            shape.playShapeSound();
            shape.translateShape();
            shape.eraseShape();
            System.out.println("*******************");
        }
    }

}
