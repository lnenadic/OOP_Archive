package Rok_5_21.ZD2;

public class TV extends Device implements Service{

    private String model;
    private String manufacturer;
    private int yr;

    public TV(String model, int yr) {
        this.model = model;
        this.yr = yr;
        device_id = device_id++;
        this.manufacturer = manufacturer;
    }

    @Override
    public void powerSupply() {
        System.out.println("Constantly on the power grid ..");
    }

    @Override
    public void operate() {
        System.out.println("Reliable operation at least for five years ...");
    }

    @Override
    public void stopOperate() {
        System.out.println("Press TURN OFF to stop me :-) ");
    }

    @Override
    public void repair() {
        System.out.println("The best service for TV is the cheapest one ;)");
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
}
