package org.search.April23;

//Question 125

public class Palindrome {
    public static void main(String[] args){
        boolean test = result("Hello");
        System.out.println(test);
    }
    public static boolean result(String str1){
        String str = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int first =0;
        int last = str.length()-1;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;

    }
}
