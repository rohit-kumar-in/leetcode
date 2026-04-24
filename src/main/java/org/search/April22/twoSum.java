package org.search.April22;

//Question 167

import java.util.Arrays;

public class twoSum {
    public static void main(String [] args){
        int [] result = Twosum(new int[] {2,7,11,15},26);
        System.out.println(Arrays.toString(result));
    }
    public static int[] Twosum(int[] nums, int target){
      int first =0;
      int last = nums.length-1;

      while(first<=last){
          int sum = nums[first] +nums[last];
          if(sum==target){
              return new int[] {first+1,last+1};
          }
          else if (sum<target){
              first++;
          }
          else{
              last--;
          }
      }
        return new  int[]  {-1,-1};
    }

}
