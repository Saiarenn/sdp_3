package org.example;

public class ElectricTrain {
    private int energyCapacity;

    public ElectricTrain(int energy) {
        this.energyCapacity = energy;
    }

    public ElectricTrain() {
    }

    public int getEnergyCapacity() {
        return energyCapacity;
    }

    public void setEnergyCapacity(int energyCapacity) {
        this.energyCapacity = energyCapacity;
    }
}
