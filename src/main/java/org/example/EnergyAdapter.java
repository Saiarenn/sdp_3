package org.example;

public class EnergyAdapter implements Energy {
    private AdvancedAdapter adapter;

    public EnergyAdapter( AdvancedAdapter adapter) {
        this.adapter = adapter;
    }

    public void setAdapter(AdvancedAdapter adapter) {
        this.adapter = adapter;
    }

    public void getEnergyCapacity() {
        adapter.showSteam();
        adapter.showElectric();
    }
}
