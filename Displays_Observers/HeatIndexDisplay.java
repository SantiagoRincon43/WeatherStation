package Displays_Observers;

public class HeatIndexDisplay implements IObserver, IDisplay{

    private float heatIndex, temperature, humidity;
    
    
    @Override
    public void display() {
        System.out.println("Current Heat Index: " + getHeatIndex() + "°C");
    }
    
    public float getHeatIndex() {
        return heatIndex;
    }
    public void setHeatIndex(float heatIndex) {
        this.heatIndex = heatIndex;
    }
    
}
