package Rok_4_21.ZD3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AI_Assistant implements Cognitive{

    private static int cnt = 0;
    private int id;
    private String name;
    private Set<Integer> set2Guess;
    private static final int LWR = 1;
    private static final int UPR = 50;

    public AI_Assistant(String name) {
        this.name = name;
        id = cnt++;
    }

    @Override
    public int playGuess(Set<Integer> set) {
        Set<Integer> cl_set = new HashSet<>();
        int len = set.size();
        for (int i = 0; i < len; i++) {
            cl_set.add(new Random().nextInt(UPR - LWR) + LWR);
        }
        System.out.println("Set to guess: " + cl_set);
        System.out.println("User defined set:" + set);
        ArrayList<Integer> guessed = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (!cl_set.contains(new ArrayList<>(set).get(i))) {
                guessed.add(new ArrayList<>(set).get(i));
                temp++;
            }
        }
        System.out.println("Difference guess -> -> user defined: " + guessed);
        System.out.println("Number of diff elements:" + temp);
        return temp;
    }

    @Override
    public void think(Set<Integer> set) {

    }
}
