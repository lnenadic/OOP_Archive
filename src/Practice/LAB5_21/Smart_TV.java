package Practice.LAB5_21;

// extends ...
public class Smart_TV extends TV{

    // constructr from the parent
    public Smart_TV(Owner owner) {
        super(owner);
    }

    // playYouTube...
   public void playYouTube() {
       System.out.println(prs.getClass().getSimpleName() + " can play YouTube");
   }

    // override toString
    @Override
    public String toString() {
        return "Smart_TV{" +
                "id=" + id +
                ", prs=" + prs +
                '}';
    }
}