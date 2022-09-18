package Practice.LAB4_21;

// treba biti dijete klase Server
public class Virtual_Server extends Server{

    private final String VS = this.getClass().getSimpleName();

    public Virtual_Server(){
        this.ip_adrs = "192.168.20.1";
        this.port_number = 443;

    }


    @Override
    public boolean establish_connection(String url, String usr, String password) {
        if (!url.isEmpty() && !password.isEmpty() && !password.isEmpty()) {
            System.out.println(toString() + "\nSomething specific for establishing connection with the Virtual server...\nConnection closed for -> " + usr);
            return true;
        } else {
            return false;
        }
        
        
    }

    @Override
    public boolean close_connection(String url, String usr) {
        if (!url.isEmpty() && !usr.isEmpty()) {
            System.out.println(toString() + "\nSomething specific for closing connection with the Virtual server...\nConnection closed for -> " + usr);
            return true;
        } else {
            return false;
        }
        

    }

    // ne mijenjati
    @Override
    public String toString() {
        return super.toString() + " {" + VS + "}";
    }
}

