package org.example;

public class Trip {
    private int neededEnergy;

    public Trip(int energy) {
        this.neededEnergy = energy;
    }

    public String isEnergyEnough(ElectricTrain train) {
        return neededEnergy <= train.getEnergyCapacity() ? "Train suits to this trip" : "Need train with more energy capacity";
    }
}
