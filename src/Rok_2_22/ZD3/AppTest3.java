package Rok_2_22.ZD3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppTest3 {
    public static void main(String[] args) {
        List<Aeroplane> aeroplanes = new ArrayList<>();
        List<Helicopter> helicopters = new ArrayList<>();
        float sumH = 0;
        float sumA = 0;

        for(int i=1; i<6;i++){

            if(i%2==0) {
                System.out.println("Loop: " + i);
                int cnt = helicopters.size()+1;
                System.out.println("Heli: " + cnt);
                String nameH = "Bravo_" + String.valueOf(i);
                Helicopter hc = new Helicopter(nameH, i);
                helicopters.add(hc);
                sumH += genRndFloat(1000,100);

                System.out.println("-----------------------------------------");
                System.out.println(hc.toString());
                hc.fly(genRndFloat(10,5), "South", 250);
                System.out.println("-----------------------------------------");
            }else{
                System.out.println("Loop: " + i);
                int cnt = aeroplanes.size()+1;
                System.out.println("Aero: " + cnt);
                String nameA = "Falcon_" + String.valueOf(i);
                Aeroplane ap = new Aeroplane(nameA, i);
                aeroplanes.add(ap);
                sumA += genRndFloat(1000,100);

                System.out.println("-----------------------------------------");
                System.out.println(ap.toString());
                ap.fly(genRndFloat(10,5), "North", 1000);
                System.out.println("-----------------------------------------");
            }
        }
        System.out.println("*********************************************");
        System.out.println("Helicopters distance: ");
        System.out.println(sumH);
        System.out.println("Aeroplanes distance: ");
        System.out.println(sumA);

        System.out.println("********************Writting************************");
        writeData(aeroplanes, helicopters);

    }

    public static float genRndFloat(int max, int min) {

        Random rnd = new Random();
        float res = rnd.nextFloat() * (max - min) + min;

        return res;
    }

    public static void writeData(List<Aeroplane> aeroplanes, List<Helicopter> helicopters){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("helicopers.bin"));
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("aeroplanes.bin"));

            for (int i = 0; i < aeroplanes.size(); i++) {
                System.out.println("writing: " + aeroplanes.get(i));
                writer.write(aeroplanes.get(i) + "\n");
            }
            for (int i = 0; i < helicopters.size(); i++) {
                System.out.println("writing: " + helicopters.get(i));
                writer.write(helicopters.get(i) + "\n");
            }

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Nothing to write in the file - input data structure is empty!");
        }
    }

}
