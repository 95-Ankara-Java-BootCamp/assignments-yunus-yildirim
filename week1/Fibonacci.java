package week1;

/**
 * Verilen n değeri için n adet fibonacci sayısını ekrana yazdıran program
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 11;

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    /**
     * input: n 
     * output: n. fibonacci sayısı
     */
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
