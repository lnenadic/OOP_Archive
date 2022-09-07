package Practice;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer>empIDs = new HashMap<>();
        empIDs.put("Lovre", 7);
        empIDs.put("Lucija", 9);
        System.out.println(empIDs);
        System.out.println(empIDs.get("Lovre"));
    }
}
