package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Main {
    public static void main(String[] args) {




        Person person1=new Person("Vasya", "Petrov", 26);
        System.out.println(person1);


        Gson gson = new GsonBuilder().setPrettyPrinting()
                .create();

        String json = gson.toJson(person1);

        System.out.println(json);

        Person person2 = gson.fromJson(json, Person.class);

        System.out.println(person2);

        System.out.println( person1.equals(person2));


    }
}