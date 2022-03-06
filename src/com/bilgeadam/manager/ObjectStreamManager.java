package com.bilgeadam.manager;


import java.io.*;

public class ObjectStreamManager  {
    public ObjectOutputStream recordObject(Object object) {
        ObjectOutputStream record =null;
        try  {
            record = new ObjectOutputStream(new FileOutputStream(("recordedObject.bin")));
            record.writeObject(object);

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        return record;
    }
    public ObjectInputStream readObject()  {

        ObjectInputStream read = null;
        try {
             read = new ObjectInputStream(new FileInputStream("recordedObject.bin"));
            System.out.println(read.readObject());
        }catch (IOException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
        return read;
    }
}
