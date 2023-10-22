package org.example;

public class Main {
    public static void main(String[] args) {
        SteamTrain steam1 = new SteamTrain(600);
        ElectricTrain electric1 = new ElectricTrain(5000);

        Trip trip = new Trip(steam1);
        trip.getEnergyCapacity();
        trip.setAdapter(electric1);
        trip.getEnergyCapacity();
    }
}