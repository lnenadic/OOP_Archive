package Rok_4_22.ZD1;

import java.util.Date;

public class Employer {

    private String name;
    private Date yob;
    private Date yoe;
    private String status;
    private String city;

    public Employer(String name, Date yob, Date yoe, String status,
                    String city) {
        this.name = name;
        this.yob = yob;
        this.yoe = yoe;
        this.status = status;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", dob=" + yob +
                ", fstEmplYear=" + yoe +
                ", emplStatus=" + status + '\'' +
                ", city=" + city + '\'' +
                '}';
    }
}
