package org.example;

import Klasy.Osoba;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Adam", "Kowalski");
        System.out.println(osoba.getInfo());
<<<<<<< HEAD
        System.out.println(osoba.getInfo());
        Osoba osoba2 = new Osoba("Amelia", "Nowak");
        System.out.println(osoba2.getInfo());
        System.out.println("Hello");
=======
        Osoba osoba2 = new Osoba("Amelia", "Nowak");
        System.out.println(osoba2.getInfo());
>>>>>>> da202aae45fedd78eea665e54d0dd65714eeb66d
    }
}