package Practice.LAB6_21;

import java.util.ArrayList;

/**
 * Class Boat that receives boat name and needs to
 * populate crew members list
 * @author sit
 * @version 1.1
 */


public class Boat {

    // class attributes -> see class diagram
    private static int cbt = 10;
    private int id;
    private String boatName;
    private ArrayList<String> crew;


    /**
     * Constructor for the class Boat
     * @param name String name for the boat
     */
    public Boat(String name){
        this.boatName = name;
        this.id = cbt;
        cbt++;
        crew = new ArrayList<String>();

    }

    /**
     * Method that ads members to the boat crew list
     * @param member String name of the member
     */
    public void addCrewMember(String member) {
        crew.add(member);
    }
    

    /**
     * Method that lists all crew members
     */
    
    public void listAllCrewMembers() {
        for (String allCrew : crew) {
            System.out.println("Crew member " + allCrew);
        }
    }

    @Override
    public String toString() {
        return "Boat{" +
                "id=" + id +
                ", boatName='" + boatName + '\'' +
                ", crew=" + crew +
                '}';
    }

    public Object getId() {
        return id;
    }
}
