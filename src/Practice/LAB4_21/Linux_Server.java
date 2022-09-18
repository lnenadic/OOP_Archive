package Practice.LAB4_21;

// poširuje apstraktnu klasu Server
public class Linux_Server extends Server{

    private final String LS = this.getClass().getSimpleName();

    public Linux_Server(){
        this.ip_adrs = "172.16.1.1";
        this.port_number = 80;

    }


    @Override
    public boolean establish_connection(String url, String usr, String password) {

        if (!url.isEmpty() && !password.isEmpty() && !password.isEmpty()) {
            System.out.println(toString() + "\nSomething specific for establishing connection with the Linux server...\nConnection closed for -> " + usr);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean close_connection(String url, String usr) {

        if (!url.isEmpty() && !usr.isEmpty()) {
            System.out.println(toString() + "\nSomething specific for closing connection with the Linux server...\nConnection closed for -> " + usr);
            return true;
        } else {
            return false;
        }

    }

    // ne mijenjati
    @Override
    public String toString() {
        return super.toString() + " {" + LS + "}";
    }

}
