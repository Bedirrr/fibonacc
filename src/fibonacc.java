public class fibonacc {
    public static void main(String[] args) {
        int n = 10; // Fibonacci serisinin kaçıncı elemanına kadar hesaplanacağı
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { // İlk iki elemanı doğrudan yazdırıyoruz
            return n;
        } else { // Diğer elemanlar için özyinelemeli olarak hesaplıyoruz
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}