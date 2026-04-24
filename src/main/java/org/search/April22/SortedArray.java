package org.search.April22;

// Question number 977

import java.util.Arrays;

public class SortedArray {
    public static void main(String [] args){
        int[] num = sortedarray(new int[] {-4,-1,0,3,10});
        System.out.println(Arrays.toString(num));
    }
    public static int[] sortedarray(int[] nums){
       /* for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;

        */

        int n = nums.length;
        int [] res= new int[n];
        int first =0;
        int last = n-1;
        int pos = n-1;

        while(first<=last){
            int leftsqr = nums[first] * nums[first];
            int rightsqr = nums[last] * nums[last];

            if(leftsqr>rightsqr){
                res[pos--] = leftsqr;
                first++;
            } else{
                res[pos--] = rightsqr;
                last--;
            }
        }
        return res;

    }
}
