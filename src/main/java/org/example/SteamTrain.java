package org.example;

public class SteamTrain implements AdvancedAdapter{
    private int coalCapacity;

    public SteamTrain(int coal) {
        this.coalCapacity = coal;
    }

    public int getCoalCapacity() {
        return coalCapacity;
    }

    public void setCoalCapacity(int coalCapacity) {
        this.coalCapacity = coalCapacity;
    }

    @Override
    public void showSteam() {
        System.out.println("Steam train with " + this.coalCapacity * 8 + " kW energy capacity");
    }

    @Override
    public void showElectric() {
    }
}
