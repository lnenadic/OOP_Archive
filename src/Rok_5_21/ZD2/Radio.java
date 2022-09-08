package Rok_5_21.ZD2;

public class Radio extends Device implements Service{

    private String model;
    private String manufacturer;
    private int yr;

    public Radio(String model, int yr) {
        this.model = model;
        this.yr = yr;
        device_id = device_id++;
        this.manufacturer = manufacturer;
    }

    @Override
    public void powerSupply() {
        System.out.println("Some models can operate on bateries ....");
    }

    @Override
    public void operate() {
        System.out.println("Find a proper frequency ...");
    }

    @Override
    public void stopOperate() {
        System.out.println( "Turn off or unplug power supply :-) ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYr() {
        return yr;
    }

    public void setYr(int yr) {
        this.yr = yr;
    }

    @Override
    public void repair() {
        System.out.println("Find some radio service ...");
    }
}
