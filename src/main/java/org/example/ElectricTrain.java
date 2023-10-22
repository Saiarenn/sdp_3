package org.example;

public class ElectricTrain implements AdvancedAdapter{
    private int energyCapacity;

    public ElectricTrain(int energy) {
        this.energyCapacity = energy;
    }

    public int getEnergyCapacity() {
        return energyCapacity;
    }

    public void setEnergyCapacity(int energyCapacity) {
        this.energyCapacity = energyCapacity;
    }

    @Override
    public void showSteam() {

    }

    @Override
    public void showElectric() {
        System.out.println("Electric train with " + this.energyCapacity + " kW energy capacity");
    }
}
