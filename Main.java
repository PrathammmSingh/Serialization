import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Player player = new Player();

        player.name = "Pratham Singh";
        player.age = 21;

        FileOutputStream fileout = new FileOutputStream("file1.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(player);
        out.close();
        fileout.close();

        System.out.println("Changes Saved :)");

        long serialVersionUID = ObjectStreamClass.lookup(player.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}