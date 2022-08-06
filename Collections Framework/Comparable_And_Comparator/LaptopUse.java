package Comparable_And_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopUse {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 800, 16));
        laps.add(new Laptop("MacBook", 1600, 8));
        laps.add(new Laptop("HP", 700, 12));

        // Now to sort them based on other parameters
        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            public int compare(Laptop l1, Laptop l2){
                if(l1.getPrice() > l2.getPrice()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        
        Collections.sort(laps,comparator);
        
        // Collections.sort(laps);


        for(Laptop l: laps){
            System.out.println(l);
        }
    }
}
