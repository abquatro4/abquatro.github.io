//Creator Albert, stores data for a swimming pool.
//Class: Software Devolpment 2025
public class poolData {
    int temp; //current pool temp
    int LeafAmount; //Amount of leaves spotted in the pool
    String poolColor; //What color the pool is.
    int tempCelsius; //Pool temp in Celsius.
    public poolData(int currentTempFahrenheit, int LeafAmountNow, String currentColor) {
        currentTempFahrenheit=temp; //What temp is in the constructor
        LeafAmountNow=LeafAmount; //What leafAmount is in the constructor
        currentColor=poolColor; //what poolcolor is in the constructor
    };
    
    public poolData() {
        int tempCelsius=temp-32*5/9; //Formula to convert the pool's fahrenheit temp to celsius.
        
        System.out.println("pool temp in Celsius"+tempCelsius);
    }
     public String toString (){
        return poolColor;
    };    
}
