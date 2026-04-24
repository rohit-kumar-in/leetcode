package org.search.April22;

import java.util.Arrays;

public class moveZero {
    public static void main(String [] args){
        Movezero(new int[]{0,1,0,3,1,2});
    }
    public static void Movezero(int[] nums){
        int i=0;
        for(int j=0;j<nums.length; j++){
            if(nums[j]!=0){
                int temp = nums[i];
                 nums[i] = nums[j];
                 nums[j]=temp;
                 i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
