package Recursion;

public class PrintNto1 {

    public static void print(int n,int i) {
        if (n < i) {
            return;
        }
        System.out.println(n);
        print(n-1,i);
    }
    public static void main(String[] args) {
        print(50,1);
    }
}
