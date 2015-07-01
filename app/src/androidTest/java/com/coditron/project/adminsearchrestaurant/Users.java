package com.coditron.project.adminsearchrestaurant;

import com.coditron.project.adminsearchrestaurant.Models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by estacion on 01/07/15.
 */
public class Users {
    //Dummies
    public static final String[] codes = {
        "123456789","987654321"
    };
    public static final String[] ids = {
        "1","2","3","4"
    };
    public static final String[] names = {
        "Pedro","Ricardo","Sofia","Leonardo"
    };
    public static final String[] lastNames = {
        "Retamozo","Mejia", "Vergara", "Dicaprio"
    };
    public static final String[] directiones = {
        "Av. Canevaro n° 234","Entre la Av. Universitaria y Av. Argentina N° 234",
        "Tomas Valle Mz. A3 Lote 3", "Cruce del jiron x e y altura del paradero Pollo"
    };
    public static final String[] phones = {
        "51997541325","51987241321","5211518","12347845"
    };
    public static final String[] sedes = {
        "Lima","Lima","Lima","Lima"
    };
    public static final String[] emails = {
        "cuzicusa@hotmail.com","mejia123@gmail.com","sofi21@hotmail.com","dicapriO07@gmail.com",
    };
    public static final String[] Passwords = {
        "123admin","123employee","admin123","employee123"
    };
    public static final Integer[] types = {
        0,1,0,1
    };
    public static final Integer[] states = {
        1,1,1,1
    };



    public static List<User> exampleList(){
        List<User> items = new ArrayList<>();
        int count=0;
        int codeCount=0;
        while(count<=codes.length && codeCount<codes.length){
            /*Admins*/
            items.add(new User(codes[codeCount],ids[count],names[count],lastNames[count],
                    directiones[count],phones[count],sedes[count],emails[count],
                    Passwords[count],types[count],states[count]));
            /*Employees*/
            items.add(new User(codes[codeCount],ids[count+1],names[count+1],lastNames[count+1],
                    directiones[count+1],phones[count+1],sedes[count+1],emails[count+1],
                    Passwords[count+1],types[count+1],states[count+1]));

            count+=2;
            codeCount+=1;
        }
        return new ArrayList<>(items);
    }

}
