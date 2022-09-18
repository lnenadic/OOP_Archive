package Practice.LAB4_21;// Uvoz ArrayList


import java.util.ArrayList;
import java.util.List;

public class Testing {

    public static void main(String[] args) {
        
        // kreiranje liste <Server> s referencom servers
        ArrayList<Server> servers = new ArrayList<>();
        
        // dodati objekt Virtual_Server u servers
        Virtual_Server virtual_server = new Virtual_Server();
        servers.add(virtual_server);
        // dodati objekt Linux_Server u servers
        Linux_Server linux_server = new Linux_Server();
        servers.add(linux_server);
        // dodati objekt Windows_Server u servers
        Windows_Server windows_server = new Windows_Server();
        servers.add(windows_server);
        
        // zadano - ne mijenjati
        String url = "conn:@dbs:1800:se";
        String usr = "user_007";
        String password = "5697845068409";
        // static method establishConnection
        establishConnection(servers, url, usr, password);
        // ne mijenjati ovaj dio ispisa
        System.out.println("******************************************************");
        // static method closeConnection
        closeConnection(servers, url ,usr);
    }
    
    // static method establishConnection -> za svaki server poziva metodu za uspostavu veze s istim podacima
    // pogledati dijagrgam klasa
    public static void establishConnection(List<Server> servers, String url, String usr, String password) {
        for (Server s : servers) {
            s.establish_connection(url, usr, password);
        }
    }

    // static method closeConnection -> za svaki server poziva metodu za zatvaranje veze s istim podacima
    // pogledati dijagram klasa
    public static void closeConnection(List<Server> servers, String url, String usr) {
        for (Server s : servers) {
            s.close_connection(url, usr);
        }
    }
}