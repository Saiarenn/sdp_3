package org.example;

public class Main {
    public static void main(String[] args) {
        SteamTrain steam1 = new SteamTrain(650);
        ElectricTrain electric1 = new ElectricTrain(5000);
        Trip trip = new Trip(5000);
        EnergyAdapter adapter = new EnergyAdapter(steam1);

        System.out.println(trip.isEnergyEnough(electric1));
        System.out.println(trip.isEnergyEnough(adapter));
    }
}