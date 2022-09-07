package Practice;

public class DaysEnums {
    public static void main(String[] args) {
        EnumsJava daysEnums = EnumsJava.FRIDAY;

        if (daysEnums == EnumsJava.FRIDAY) {
            System.out.println("It is friday :) ");
        }

        for (EnumsJava myDay : EnumsJava.values()) {
            System.out.println(myDay);
        }

    }
}
