package Hashing;

import java.util.Scanner;

public class Freqofchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abddrfjjj";

        //cpmputing hash
        int[] hash = new int[26];  //or [256] => maximum characters
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }

        //print
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch +"="+hash[ch-'a']);
        }   

    }
}
