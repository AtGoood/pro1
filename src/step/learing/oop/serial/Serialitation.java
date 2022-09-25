package step.learing.oop.serial;

import java.io.*;

public class Serialitation  {


    public void Serilazie()
    {
dataobj data1=new dataobj();
        dataobj data2=new dataobj(10);
        dataobj data3=new dataobj(10,20.5f);
        dataobj data4=new dataobj(10,20.5f,"hello");
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);

        try (FileOutputStream file =new FileOutputStream("save.ser") )
        {
            ObjectOutputStream oss = new ObjectOutputStream(file);
            oss.writeObject(data1);
            oss.writeObject(data4);
            oss.flush();
        }
        catch (IOException e) {
            System.out.println("err:"+e.getMessage());
            return;
        }
        System.out.println("serialized");
    }
    public void run()
    {this.Serilazie();
        try (FileInputStream file =new FileInputStream("save.ser") )
        {

            ObjectInputStream ios=new ObjectInputStream(file);
            dataobj data=(dataobj) ios.readObject();
            System.out.println(data);
            data=(dataobj)ios.readObject();
            System.out.println(data);
        }
        catch (Exception e) {
            System.out.println("err:"+e.getMessage());
            return;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
