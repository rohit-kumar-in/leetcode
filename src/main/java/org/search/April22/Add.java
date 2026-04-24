package org.search.April22;

import java.util.Arrays;

public class Add {
    public static void main(String [] args){
        // give index of output i+j = N return i,j
      //  int [] result = first (new int[]{5, 8, 9, 12, 18}, 20);
       // System.out.println(Arrays.toString(result));
       // swapchat('c','d');
        arraytest(new int[] {-2,-4,5,6,7});
    }
    public static int[] first(int[] nums, int result){
        int first = 0;
        int last = nums.length-1;

        while(first<last){
            int test_result = nums[first] + nums[last];
            if(test_result== result){
                return new int[] {first,last};
            }
            else if(test_result<result){
                first++;
            }
            else{
                last--;
            }
        }
        return new int[] {-1,-1};

    }
    public static void swapchat(char first, char second){
        char temp = first;
        first = second;
        second = temp;

        System.out.println("First char " + first+ " second char " + second);
    }
    public static void arraytest(int[] nums){
        for(int i =0;i<nums.length; i++){
            nums[i]= nums[i]*nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
