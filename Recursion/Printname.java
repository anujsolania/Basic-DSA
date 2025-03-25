package Recursion;

public class Printname {

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("anuj");
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);

    }
}
