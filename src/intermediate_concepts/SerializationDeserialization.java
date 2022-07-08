package intermediate_concepts;

import java.io.*;

/**
 * @author VSW
 * Serialization in Java is a mechanism of writing the state of an object into a byte-stream or file.
 * In deserialization byte-stream is converted into an object.
 * The serialization and deserialization process is platform-independent.
 * Serializable is a marker interface (has no data member and method).
 */
class Seri implements Serializable {
    int i;
}

public class SerializationDeserialization {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Seri obj = new Seri();
        obj.i = 4;

        // Now we have object of class Seri assigned with value 4, i.e it has some state.
        // Now lets save this state to file.

        File f = new File("Obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        // We have successfully saved state now lets load it again.

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Seri Obj1 = (Seri) ois.readObject(); // Typecast to its class.

        System.out.println("Deserialized Object value:- "+ Obj1.i);

    }
}
