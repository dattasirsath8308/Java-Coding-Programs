import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.StubNotFoundException;

public class SerializableInterface implements Serializable {
    
    int id;
    String name;
    int Mark;

    public SerializableInterface()
    {

    }

    public SerializableInterface(int id ,String name, int Mark)
    {
        this.id = id;
        this.name = name;
        this.Mark = Mark;
    }


    public static void main(String[] args) {
        

        try {


            // Serialization means  Convert Object to byte stream.
            //  Output Stream Write
            
            SerializableInterface s1 = new SerializableInterface(1, "Bhau", 98);
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();
            System.out.println("details is save in file successfully.");


            // DeSerialization means  Convert  byte stream to Object .
            //  Input Stream read 

            System.out.println("Deserialization");
            SerializableInterface s2 = new SerializableInterface();

            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SerializableInterface) ois.readObject();
            System.out.println("Read Object data from file");
            System.out.println("Id :" +s2.id +", Name :"+ s2.name +", Mark :"+ s2.Mark );

        

        } catch (Exception e) {
            e.printStackTrace();
        }






    }


}
