package org.search.April23;

import java.util.ArrayList;
import java.util.List;

//valid palindrome madam
public class test {
    public static void main(String[] args){
        boolean result = palindrome("race a car");
        System.out.println(result);

        // print 2D array 3 * 3
        List<List<Integer>> num = nestedarray(new int[] {1,2,3,4,5,6,7,8,9});
        System.out.println(num);
    }
    public static boolean palindrome(String str){
        int first = 0;
        String str1 = str.replace(" ", "");
        int last = str1.length()-1;
        while(first<=last){
            if(str1.charAt(first)!=str1.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static List<List<Integer>> nestedarray(int[] nums){
        List<List<Integer>> first = new ArrayList<>();
        int index = 0;
        for(int i=0; i<3;i++){
            List<Integer> last = new ArrayList<>();
            for(int j=0; j<3;j++){
                last.add(nums[index++]);
            }
            first.add(last);
        }
        return first;
    }
}
