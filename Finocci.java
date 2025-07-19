public class Finocci {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];

        // Initialize first two values
        arr[0] = 0;
        if(n > 1) arr[1] = 1;

        // Fill the rest using sum of previous two
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
