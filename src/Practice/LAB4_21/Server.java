package Practice.LAB4_21;

// ne mijenjati - sve zadano
public abstract class Server {

    protected int port_number;
    protected String ip_adrs;

    public abstract boolean establish_connection(String url, String usr, String password);
    public abstract boolean close_connection(String url, String usr);

    @Override
    public String toString() {
        return "Server{" +
                "port_number=" + port_number +
                ", ip_adrs='" + ip_adrs + '\'' +
                '}';
    }
}