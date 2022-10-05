package Rok_5_21.ZD3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car implements Engine{

    private String autoManufacturer;
    private String model;
    private Date manufactured;
    private int years;

    public Car(String autoManufacturer, String model, String date) throws ParseException {
       this.autoManufacturer = autoManufacturer;
       this.model = model;
       this.manufactured =  new SimpleDateFormat("YYYY").parse(date);
       this.years = 2022 - Integer.parseInt(date);

    }

    @Override
    public void start() {
        System.out.println(this.model + " is starting engine...");
    }

    @Override
    public void stop() {
        System.out.println(this.model + " is stopping engine...");
    }

    @Override
    public String toString() {
        return "Car {" +
                "autoManufacturer='" + autoManufacturer + '\'' +
                ", model='" + model + '\'' +
                ", manufactured=" + manufactured +
                ", years=" + years +
                '}';
    }

    public String getAutoManufacturer() {
        return autoManufacturer;
    }

    public String getModel() {
        return model;
    }

    public Date getManufactured() {
        return manufactured;
    }

    public int getYears() {
        return years;
    }

}
