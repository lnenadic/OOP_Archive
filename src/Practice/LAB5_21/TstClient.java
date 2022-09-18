package Practice.LAB5_21;// imports

import java.util.ArrayList;
import java.util.List;

public class TstClient {

    // see class diagram
    private static List<ABS_DEVICE> devices = new ArrayList<>();
    private static Owner owner = new Owner("Owner-101");
    private static Smart_TV smart;

    public static void main(String[] args) {
        // see proposed logic
        TV tv = new TV(owner);
        Radio radio = new Radio(owner);
        Smart_TV smartTV = new Smart_TV(owner);
        device2List(devices, tv);
        device2List(devices, radio);
        device2List(devices, smartTV);
        System.out.println("<<<<<<<<<<<<< Devices list - info >>>>>>>>>>>>>");
        getInfoDevices(devices);
        System.out.println("<<<<<<<<<<<<< Charging >>>>>>>>>>>>>");
        chargeDevices(devices);
        smartTV.playYouTube();
        smartTV.charging();

    }

    // implement all methods - from table specifications
    // also - see class diagram
    public static void device2List(List<ABS_DEVICE> devices, ABS_DEVICE device) {
        if (!isSmartTV(device)) {
            devices.add(device);
            System.out.println("Adding new device in the list of devices...");
        } else {
            System.out.println(device.getClass().getSimpleName() + " can not be added to the list!");
        }
    }

    public static boolean isSmartTV(ABS_DEVICE device) {
        if (device instanceof Smart_TV) {
            return true;
        } else {
            return false;
        }
    }

    public static void getInfoDevices(List<ABS_DEVICE> devices) {
        for (ABS_DEVICE device : devices) {
            device.info();
        }
    }

    public static void chargeDevices(List<ABS_DEVICE> devices) {
        for (ABS_DEVICE device : devices) {
            device.charging();
        }
    }

}
