/**
 * Created by abiaps on 4/22/2017.
 */
public class TwoSum2InputArraySorted {
    public static int[] twoSum(int[] numbers, int target) {
        int ind1 = -1, ind2 = -1;
        for (int i = 0; i < numbers.length; i++) {
            ind2 = binarySearch(numbers, target - numbers[i], i);
            if (ind2 != -1) {
                ind1 = i;
                break;
            }
        }
        int[] ind = {ind1 + 1, ind2 + 1};
        return ind;
    }

    public static int binarySearch(int[] arr, int n, int index) {
        int left = 0, right = arr.length - 1, ind = -1;
        while (left != right - 1) {
            int mid = (left + right) / 2;
            if (arr[mid] == n) {
                if (mid != index) {
                    ind = mid;
                    break;
                } else left = mid;
            } else if (arr[mid] < n)
                left = mid;
            else if (arr[mid] > n)
                right = mid;
        }
        if (left == right - 1) {
            if (arr[left] == n) ind = left;
            else if (arr[right] == n) ind = right;
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 4, 9, 56, 90};
        int target = 8;
        System.out.println(twoSum(input, target));
    }
}
