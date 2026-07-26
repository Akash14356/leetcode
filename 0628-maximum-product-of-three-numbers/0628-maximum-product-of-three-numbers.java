import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int product2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(product1, product2);
    }
}