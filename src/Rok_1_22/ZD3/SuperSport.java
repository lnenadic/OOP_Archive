package Rok_1_22.ZD3;

public class SuperSport extends StreamingService implements Comparable<StreamingService>{

    protected SuperSport(String serviceName, double monthly) {
        super(serviceName, monthly);

    }


    @Override
    protected void describeSubscription() {

    }

    @Override
    public int compareTo(StreamingService ss) {
        if (id > ss.id) {
            return 1;
        } else if (id < ss.id) {
            return -1;
        } else {
            return 0;
        }
    }

}
