package org.search.April21;

//write a program to print length of last word;
//Leetcode Problem number 58;
public class LengthOfLastWord {
    public static void main(String [] args){
        int length = LastWord("Hello World");
        System.out.println(length);
    }
    public static int LastWord(String word){
       int i = word.length()-1;
       int length =0;
       //removing space from last
        while(i>=0 && word.charAt(i) == ' '){
            i--;
        }
        while (i>=0 && word.charAt(i)!=' '){
            i--;
            length++;
        }
        return length;
    }
}
