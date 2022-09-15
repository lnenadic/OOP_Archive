package Rok_1_22.ZD2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Laboratory {

    private int id;
    private static int cntID;
    private String labName;

    public Laboratory(String labName) {
        this.labName = labName;
    }

    List<Person> personel = new ArrayList<>();

    public void addNewPersonel(Person person) {
        if (personel.contains(person)) {
            System.out.println("Already staff in this laboratory...");
        } else {
            personel.add(person);
            System.out.println("Adding new personel...");
        }
    }

    public void listAllPersonel() {
        System.out.println("-------------------------" + labName + "-------------------------");
        System.out.println(Arrays.asList(personel));
    }

}
