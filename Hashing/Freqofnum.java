package Hashing;

import java.util.Scanner;

public class Freqofnum { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //taking input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precomputing
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //print the frequency
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+"=" +hash[i]+" ");
        }
    }
}
