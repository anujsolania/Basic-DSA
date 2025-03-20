import java.util.Scanner;

public class Patterns {

    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void triangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void triangle3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public static void triangleReverse(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleReverse2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            //for space 
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pyramidReverse(int n) {
        for (int i = 0; i < n; i++) {
            //for space 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 0; j < 2*n - (2*i+1); j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void halfDiamond(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if (i > n) { stars = 2*n-i; }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void binaryTriangle(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) start = 0;
            else start = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    
    public static void numberCrown(int n) {
        for (int i = 1; i <= n; i++) {
        //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        //space
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" ");
            }
        //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j); 
            } 
            System.out.println();
        }
    }
    
    public static void increasingNumTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    
    public static void increasingLetterTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // square(5);
        // triangle(5);
        // triangle2(5);
        // triangle3(5);
        // triangleReverse(5);
        // triangleReverse2(5);
        // pyramid(5);
        // pyramidReverse(5);
        // pyramid(5); pyramidReverse(5);
        // halfDiamond(5);
        // binaryTriangle(5);
        // numberCrown(5);
        increasingNumTriangle(5);
    }
    
}