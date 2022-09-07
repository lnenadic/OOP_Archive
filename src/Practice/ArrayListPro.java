package Practice;

import java.util.ArrayList;

public class ArrayListPro {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Burger");
        food.add("Pizza");
        food.add("Pasta");
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
