package Recursion;

public class Count {


    public static void print(int count) {
        if (count == 3) return;
        System.out.println(count);
        count++;
        print(count);
    }
    public static void main(String[] args) {
        print(0);
    }
}
