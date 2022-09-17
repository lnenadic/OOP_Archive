package Practice.LAB4;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {

        // Define data structure - empty
        ArrayList<Person> persons = new ArrayList<>();
        // Create st1
        Student student = new Student("ST-1", 3);
        // create st2
        Student student2 = new Student("ST-2", 7);

        // create prof1
        Professor professor  = new Professor("PRF-01");
        // use setters for prof1
        professor.setYearsOfTeaching(10);
        // add to data structure -> st1, st2, prof1, st1
        addToList(persons, student);
        addToList(persons, student2);
        addToList(persons, professor);
        addToList(persons, student);




        // list all from data structure
        listAllPersons(persons);

    }

    // adding one by one in the data structure
    // duplicates are not allowed
    private static void addToList(ArrayList<Person> persons, Person person){
         if (!persons.contains(person)) {
             persons.add(person);
             System.out.println("adding new person..");
         } else {
             System.out.println("person already in the list");
         }


    }

    // list all elements
    private static void listAllPersons(ArrayList<Person> persons){
        System.out.println("********************* Listing All ***************************");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
