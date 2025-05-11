package n11t5n2025;

public class fibonacci {
    public int nthFibonacci(int n) {
        // code here
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
