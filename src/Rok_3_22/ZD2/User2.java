package Rok_3_22.ZD2;

import java.util.ArrayList;
import java.util.List;

public class User2 {

    List<Integer> integerList = new ArrayList<>();
    List<Float> floatList = new ArrayList<>();


    public User2() {

    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public List<Float> getFloatList() {
        return floatList;
    }

    public void setIntegerList(int x) {
        integerList.add(x);
        System.out.println("Adding: " + x + " to int list!");
    }

    public void setFloatList(float x) {
        floatList.add(x);
        System.out.println("Adding: " + x + " to float list!");
    }

}
