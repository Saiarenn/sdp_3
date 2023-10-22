package org.example;

public class Trip implements Energy{
    private EnergyAdapter adapter;

    public Trip(AdvancedAdapter advancedAdapter) {
        this.adapter = new EnergyAdapter(advancedAdapter);
    }

    public void setAdapter(AdvancedAdapter advancedAdapter) {
        this.adapter = new EnergyAdapter(advancedAdapter);
    }

    @Override
    public void getEnergyCapacity() {
        adapter.getEnergyCapacity();
    }
}
