package Practice.LAB5_21;

import Practice.LAB5_21.Owner;

// extends ...
public class TV extends ABS_DEVICE{

    // constructor 
    public TV(Owner owner){
        // two attributes
        prs = owner;
        id  = cntDev;
        cntDev += 1;
    }

    // override all from the parent
    @Override
    protected void turnOn() {
        System.out.println(prs.getName() + " turning on " + this.getClass().getSimpleName());
    }

    @Override
    protected void turnOff() {
        System.out.println(prs.getName() + " turning off " + this.getClass().getSimpleName());
    }

    @Override
    protected void charging() {
        System.out.println(this.getClass().getSimpleName() + " is always connected to AC current source.");
    }

    // override toString
    @Override
    public String toString() {
        return "TV{" +
                "id=" + id +
                ", prs=" + prs +
                '}';
    }
}