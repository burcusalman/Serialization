package com.bilgeadam;

import com.bilgeadam.manager.ObjectStreamManager;
import com.bilgeadam.model.Person;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Burcu",29,true);
        Person person2 = new Person("Filiz",34,true);

        ObjectStreamManager objectStreamManager = new ObjectStreamManager();

            objectStreamManager.recordObject(person1);

        ObjectOutputStream oos = objectStreamManager.recordObject(person2);
        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        objectStreamManager.readObject();
           ObjectInputStream ois = objectStreamManager.readObject();
        try {
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
