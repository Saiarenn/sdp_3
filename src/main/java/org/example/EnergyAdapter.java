package org.example;

public class EnergyAdapter extends ElectricTrain{
    private SteamTrain steamTrain;

    public EnergyAdapter(SteamTrain steamTrain) {
        this.steamTrain = steamTrain;
    }

    public int getEnergyCapacity() {
        return steamTrain.getCoalCapacity() * 8;
    }
}
