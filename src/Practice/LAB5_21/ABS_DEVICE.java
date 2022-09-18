package Practice.LAB5_21;

// this one is abstract class
public abstract class ABS_DEVICE {

    // see class diagram for attributes and methods
   protected int id;
   protected static int cntDev = 100;
   protected Owner prs;

    // do not change this one
    public void info(){
        System.out.println(toString());
    }

    // methods - inheritance ...
    protected abstract void turnOn();
    protected abstract void turnOff();
    protected abstract void charging();


    @Override
    public String toString() {
        return "ABS_DEVICE{" +
                "id=" + id +
                ", prs=" + prs +
                '}';
    }
}
