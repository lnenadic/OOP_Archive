package Rok_1_22.ZD2;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void getSharedStaff(List<Person> list, List<Person> list2) {
        ArrayList<Person> shared = new ArrayList<>();
        System.out.println("------------------------- Intersection - shared staff -------------------------");
        for (int i = 0; i < list.size(); i++) {
            if (list2.contains(list.get(i))){
                shared.add(list.get(i));
            }
        }
        System.out.println(shared.toString());
    }

    public static void main(String[] args) {

        Laboratory lab1 = new Laboratory("Future Lab");
        Laboratory lab2 = new Laboratory("AI Lab");
        Professor prof1 = new Professor("Baltazar", "Astronomy");
        Professor prof2 = new Professor("Wendy", "CS");
        Student stud1 = new Student("Ema", "IT");
        Student stud2 = new Student("Mema", "CS");
        Lab_Assistant labAss = new Lab_Assistant("Teo", "Cyber security");
        lab1.addNewPersonel(prof1);
        lab1.addNewPersonel(stud1);
        lab1.addNewPersonel(labAss);
        lab2.addNewPersonel(prof2);
        lab2.addNewPersonel(stud2);
        lab2.addNewPersonel(labAss);
        lab1.listAllPersonel();
        lab2.listAllPersonel();
        Professor prof3 = new Professor("Bloom", "AI");
        lab1.addNewPersonel(prof3);
        lab2.addNewPersonel(prof3);
        getSharedStaff(lab1.personel, lab2.personel);


    }

    public AppTest() {

    }


}
