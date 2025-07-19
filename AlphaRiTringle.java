public class AlphaRiTringle {
    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Example main method to test the pattern
    public static void main(String[] args) {
        pattern14(5);
    }
}