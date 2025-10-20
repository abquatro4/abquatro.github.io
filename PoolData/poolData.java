package PoolData;
//Creator Albert, stores data for a swimming pool.
//Class: Software Devolpment 2025
public class poolData {
    float temp; //current pool temp
    int LeafAmount; //Amount of leaves spotted in the pool
    String poolColor; //What color the pool is.
    String tempCelsius; //Pool temp in Celsius.
    public poolData(int currentTempFahrenheit, int LeafAmountNow, String currentColor) {
        temp=currentTempFahrenheit; //What temp is in the constructor
        LeafAmount=LeafAmountNow; //What leafAmount is in the constructor
        poolColor=currentColor; //what poolcolor is in the constructor
    };
    
    public float tempInCelsius() {
        float tempCelsius=(temp-32)*5/9; //Formula to convert the pool's fahrenheit temp to celsius.
        return tempCelsius;
    }
    public String toColor() {
        return poolColor;
    };
}
