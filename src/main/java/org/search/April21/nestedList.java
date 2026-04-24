package org.search.April21;

//write a program to print 2 D array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nestedList {
    public static void main(String[] args){
        List<List<Integer>> num = new ArrayList<>();

        num.add(Arrays.asList(2,4,5));
        num.add(Arrays.asList(5,6,9));
        num.add(Arrays.asList(5,7,8));

        for(int i = 0; i<num.size(); i++){
            for (int j = 0; j<=i; j++){
                System.out.print(num.get(i).get(j) + ',');
            }

        }

    }
}
