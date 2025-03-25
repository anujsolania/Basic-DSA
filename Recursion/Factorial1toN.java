package Recursion;

public class Factorial1toN {
    public static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial is "+fact(5));
    }
}
