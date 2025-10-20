//Creator Albert
//Class: Software and Programming Dev 1
package PoolData;
public class poolDataWrapper {
    public static void main(String[] args) { //Creates a new main string
        poolData pool1=new poolData(42, 3,"Blue");
        System.out.println("Pool color is: "+pool1.toColor()); //Returns color of the pool.
        System.out.println("Pool temperature in Celsius: "+pool1.tempInCelsius()); //Returns temperature of the pool in Celsius.

        poolData pool2=new poolData(84, 15,"Green");
        System.out.println("Pool color is: "+pool2.toColor()); //Returns color of the pool.
        System.out.println("Pool temperature in Celsius: "+pool2.tempInCelsius()); //Returns temperature of the pool in Celsius.

        poolData pool3=new poolData(94, 42,"Greenish Blue");
        System.out.println("Pool color is: "+pool3.toColor()); //Returns color of the pool.
        System.out.println("Pool temperature in Celsius: "+pool3.tempInCelsius()); //Returns temperature of the pool in Celsius.
    }
}