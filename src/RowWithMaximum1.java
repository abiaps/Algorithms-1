/**
 * Created by abiaps on 4/5/2017.
 * Find the maximum length of consecutive ones in a nxm matrix which has only 0's and 1's
 */
public class RowWithMaximum1 {
    public static int binarySearch(int[] n, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (left == right - 1)
                break;
            if (n[mid] == 1 && n[mid - 1] == 0)
                return mid;
            else if (n[mid] == 0 && n[mid + 1] == 1)
                return mid + 1;
            else if (n[mid] == 1 && n[mid - 1] == 1)
                right = mid;
            else left = mid;
        }
        if (n[left] == 1) return left;
        else if (n[right] == 1) return right;
        return -1;
    }

    public static int findMaxOne(int[] arr, int rowNo, int col) {
        return binarySearch(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[][] n = {{0, 0, 1, 1}, {1, 1, 1, 0}, {0, 0, 1, 1}, {0, 0, 0, 1}, {1, 0, 0, 0}, {1, 1, 1, 1}};
        int rowsize = 6, colsize = 4;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rowsize; i++) {
            int maxOneRow = findMaxOne(n[i], i, colsize);
            if (maxOneRow != -1) {
                maxOneRow = colsize - maxOneRow;
                if (maxOneRow > max) max = maxOneRow;
            }
        }
        System.out.println(max);
    }
}
