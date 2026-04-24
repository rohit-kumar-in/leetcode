package org.search.April22;

import java.util.Arrays;

public class ReverseString {
    public static void main(String [] args){
        reversestring(new char[] {'h','e','l','l','o'});
    }
    public static void reversestring(char[] s){
        int first =0;
        int last =s.length-1;
        while(first<=last){
                char temp = s[first];
                s[first]=s[last];
                s[last]=temp;
                first++;
                last--;
        }
        System.out.println(Arrays.toString(s));
    }
}
