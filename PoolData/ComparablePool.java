package PoolData;
//Creator: Albert
//Class: Software Devolpment 1

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ComparablePool implements Comparable<ComparablePool> {//Implements comparable interface.
    int MonthlyVistors;
    String PoolName;
    int DaysOpen;
    ComparablePool(String PoolName, int MonthlyVistors) {

        this.PoolName=PoolName;
        this.MonthlyVistors=MonthlyVistors;
    }
    
    public int compareTo(ComparablePool a) { 
        return  this.MonthlyVistors - a.MonthlyVistors;
    }
}
    class dataclass { //This class is what gives the information.
        public static void main(String[] args) {
            ArrayList<ComparablePool> list 
            = new ArrayList<ComparablePool>();

              list.add(new ComparablePool("Oakland Pool", 38)); //Each list.add adds information.
              list.add(new ComparablePool("Broadview Pool", 20));
              list.add(new ComparablePool("James Tower Pool", 167));
              list.add(new ComparablePool("Riverview Pool", 50));
              list.add(new ComparablePool("Island Pool", 65));
              list.add(new ComparablePool("Public Pool", 432));
              list.add(new ComparablePool("Meridian Pool", 82));
              list.add(new ComparablePool("Treeview Pool", 38));
              list.add(new ComparablePool("Eastland Pool", 44));
              list.add(new ComparablePool("Home Pool", 10));

              Collections.sort(list, Comparator.naturalOrder());

              for (ComparablePool a : list) //Sorts the pools by natural order smallest to largest in this case.
                System.out.println(a.PoolName+ " "+ a.MonthlyVistors);
        }
    }

