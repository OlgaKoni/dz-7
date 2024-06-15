package org.example;

public class Main {
    public static void main(String[] args) {
        for(SolarSystem SolarSystem:SolarSystem.values()){
            System.out.println(SolarSystem + " - " + SolarSystem.previous + " and " + SolarSystem.next + "!");
        }
    }
}