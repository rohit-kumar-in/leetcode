package org.search.April22;

public class removeElement {
    public static void main(String [] args){
        int num = Removeelement(new int[]{3,2,2,3}, 3);
        System.out.println(num);

    }
    public static int Removeelement(int[] nums, int value){
        if(nums.length == 0){
            return 0;
        }
        int i =0;
        for(int j =0; j<nums.length; j++){
            if(nums[j]!=value){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }
}
