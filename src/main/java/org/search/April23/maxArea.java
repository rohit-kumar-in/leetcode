package org.search.April23;

public class maxArea {
    public static void main(String [] args){
        int n = Maxarea(new int[] {1,8,6,2,5,4,8,3,7});
        System.out.println(n);
    }
    public static int Maxarea(int[] height){
        int left =0;
        int right = height.length-1;
        int max =0;
        while(left<right){
            int width = right -left;
            int h = Math.min(height[left],height[right]);
            int area = width * h;
            max = Math.max(max,area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        } return max;
    }
}
