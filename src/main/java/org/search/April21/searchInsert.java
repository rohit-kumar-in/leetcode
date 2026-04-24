package org.search.April21;

// search a number
//problem number 35;
public class searchInsert {
    public static void main(String [] args){
        int num = Search(new int[]{1,2,4,6,7,8,9},7);
        System.out.println(num);
    }
    public static int Search(int[] num, int value){
        //try bruteforce
      //  int i = 0;
       /* for(i=0; i<num.length; i++){
            if(num[i] == value){
                return i;
            }
        }
        */
        // Now binary search
        int first=0;
        int last =num.length-1;
        while(first<=last){
            int mid = (first+last)/2;

            if(num[mid]==value){
                return mid;
            }
            else if (num[mid]<value){
                first = mid +1;
            }
            else {
                last = mid -1;
            }
        }

        return first;
    }
}
