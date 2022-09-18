package Practice.LAB4_21;

// proširuje apstraktnu klasu Server
public class Windows_Server extends Server{

    private final String WS = this.getClass().getSimpleName();

    public Windows_Server(){
        this.ip_adrs = "169.254.100.8";
        this.port_number = 20;

    }

    @Override
    public boolean establish_connection(String url, String usr, String password) {
        if (!url.isEmpty() && !password.isEmpty() && !password.isEmpty()) {
            System.out.println(toString() + "\nSomething specific for establishing connection with the Windows server...\nConnection closed for -> " + usr);
            return true;
        } else {
            return false;
        }
        
    }

    @Override
    public boolean close_connection(String url, String usr) {
        if (!url.isEmpty() && !usr.isEmpty()) {
            System.out.println(toString() + "\nSomething specific for closing connection with the Windows server...\nConnection closed for -> " + usr);
            return true;
        } else {
            return false;
        }
        

    }

    // dopuniti temeljem ostalih toString
    @Override
    public String toString() {
        return super.toString() + " {" + WS + "}";
    }

}


