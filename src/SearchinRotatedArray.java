import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by abiaps on 4/4/2017.
 * Given a sorted and rotated array (rotated at some point) A[ ], and given an element K, the task is to
 * find the index of the given element K in the array A[ ].
 * The array has no duplicate elements. If the element does not exist in the array, print -1.
 */
public class SearchinRotatedArray {
    public static int findPivot(int[] in) {
        int left = 0, right = in.length - 1, pivot = in[0];
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (in[mid] > pivot) {
                left = mid + 1;
            } else
                right = mid;
        }
        return left;
    }

    public static int binarySearch(int k, int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (left == right - 1)
                break;
            int mid = left + ((right - left) / 2);
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] > k) {
                right = mid;
            } else
                left = mid;
        }
        if (arr[left] == k)
            return left;
        else if (arr[right] == k)
            return right;
        return -1;
    }

    public static int findElement(int k, int[] left, int[] right, int pivot) {
        if (k >= left[0])
            return binarySearch(k, left);
        else
            return pivot + binarySearch(k, right);
    }

    public static void main(String[] args) {
        //codel
        int k = -1;
        int[] n = {3, 5, 6, 7, 8, -3, -1, -1, 1, 2};
        int pivot = findPivot(n);
        int[] leftArr = new int[pivot];
        for (int i = 0; i < pivot; i++)
            leftArr[i] = n[i];
        int[] rightArr = new int[n.length - pivot];
        int j = 0;
        for (int i = pivot; i < n.length; i++) {
            rightArr[j] = n[i];
            j++;
        }
        System.out.print(findElement(k, leftArr, rightArr, pivot));

    }
}
