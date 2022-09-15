package Rok_1_22.ZD3;

public abstract class StreamingService {

    protected  int id;
    private static int cntID;
    public double monthly;
    public String serviceName;

    protected StreamingService(String serviceName, double monthly) {
        this.serviceName = serviceName;
        this.monthly = monthly;
        this.id = cntID;
        cntID++;
    }

    protected abstract void describeSubscription();

    public double getMonthly() {
        return monthly;
    }

    public String getServiceName() {
        return serviceName;
    }

    public abstract int compareTo(StreamingService ss);
}
