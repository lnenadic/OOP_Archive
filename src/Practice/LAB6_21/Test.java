package Practice.LAB6_21;

public class Test {
    public static void main(String[] args) {
        // Create object -> name Bonaca
        Boat boat = new Boat("Bonaca");
        // add crew members
        boat.addCrewMember("Mem_1");
        boat.addCrewMember("Mem_2");
        boat.addCrewMember("Mem_3");
        // list all crew members
        boat.listAllCrewMembers();
        System.out.println("-------------------------------------------");
        // print string representation of the object 
        System.out.println(boat.toString());

        System.out.println("-------------------------------------------");

        // Create object -> name Bonaca
        Boat boat2 = new Boat("Neverin");
        // add crew members
        boat2.addCrewMember("Mem_1");
        boat2.addCrewMember("Mem_2");
        boat2.addCrewMember("Mem_3");
        // list all crew members
        boat2.listAllCrewMembers();
        System.out.println("-------------------------------------------");
        // print string representation of the object
        System.out.println(boat2.toString());
    }
}
