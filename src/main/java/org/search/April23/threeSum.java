package org.search.April23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String [] args){
        //need to learn nested list  -1,0,1,2,-1,-4
        List<List<Integer>> test = Threesum(new int[] {-1,0,1,2,-1,-4});
        System.out.println(test);
    }
    public static List<List<Integer>> Threesum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        // -4,-1,-1,0,1,2,4
        for (int i = 0; i < nums.length - 2; i++) {

            // 2. skip duplicate "first number"
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;               // second pointer
            int right = nums.length - 1;    // third pointer

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // 3. skip duplicates for left
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // 4. skip duplicates for right
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }

                else if (sum < 0) {
                    left++; // need bigger sum
                }

                else {
                    right--; // need smaller sum
                }
            }
        }
        return res;
    }
}
