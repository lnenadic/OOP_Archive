package Practice.LAB8_21;

import Practice.LAB8_21.User;

import java.io.*;
import java.util.TreeMap;

public class SerDeserial {

    public static void saveUsr2File(String filepath, TreeMap<Integer, User> usrs){
        File file = new File(filepath);
        try {
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            for (User user : usrs.values()) {
                oos.writeObject(usrs);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All saved to the file -> " + filepath);
    }


    public static void readUsr4File(String filepath){
        // u bloku finally ispisati sve iz rekonstruirane mape
        // pogledati traženi konzolni izlaz
        File file = new File(filepath);
        try {
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fin);
            while (fin.available() != 0) {
                System.out.println(ois.readObject());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
