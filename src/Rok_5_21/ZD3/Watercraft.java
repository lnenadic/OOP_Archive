package Rok_5_21.ZD3;

public abstract class Watercraft {

    protected String type;
    protected int id;
    protected String yrManufactured;
    protected String name;

    public Watercraft(String yrManufactured, String name) {
        this.yrManufactured = yrManufactured;
        this.name = name;
    }

    public abstract void cruising();

    @Override
    public String toString() {
        return "Watercraft {" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", yrManufactured='" + yrManufactured + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
