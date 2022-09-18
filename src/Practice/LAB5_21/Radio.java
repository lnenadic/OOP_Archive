package Practice.LAB5_21;

// extends ...
public class Radio extends ABS_DEVICE {

    public Radio(Owner owner){
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
        System.out.println(prs.getName() + " connects " + this.getClass().getSimpleName() + " to a charger.");
    }

    // override toString
    @Override
    public String toString() {
        return "Radio{" +
                "id=" + id +
                ", prs=" + prs +
                '}';
    }
}
