package PoolData;

public class SpacePool extends poolData{
    int Gravity;
    String Planet;
    int Name;
    public SpacePool(int currentTempFahrenheit, int LeafAmountNow, String currentColor, String Planet) {
        super(currentTempFahrenheit, LeafAmountNow, currentColor);
        this.Name=Name;
        this.Planet=Planet;
        this.Gravity=Gravity;
    }
    public static void main(String[] args) {
        
    }
}
