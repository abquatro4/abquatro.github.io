package PoolData;

/* Code creator Albert
 * Class: Software Devolpment 1
 * 
 */
public class CommunityPool extends poolData{ //Extends the poolData Class and adds to it.
    int MonthlyVistors;
    String PoolName;
    int DaysOpen;
    public CommunityPool(int currentTempFahrenheit, int LeafAmountNow, String currentColor, String PoolName, int MonthlyVistors, int DaysOpen) {
        super(currentTempFahrenheit, LeafAmountNow, currentColor);
        this.PoolName=PoolName;
        this.MonthlyVistors=MonthlyVistors;
        this.DaysOpen=DaysOpen;
    }
    public static void main(String[] args) {
        String PoolName="Oakland Pool";
        int MonthlyVistors=123;
        int DaysOpen=19;
        CommunityPool pool4 = new CommunityPool(0, 0, null, PoolName, MonthlyVistors, DaysOpen);
        System.out.println("Name "+pool4.PoolName+" vistors this month "+pool4.MonthlyVistors+" Days open "+pool4.DaysOpen);
    };
    
}
