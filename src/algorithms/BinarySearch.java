package algorithms;

import java.util.Arrays;

public class BinarySearch implements SearchPattern {
    // array must be sorted before calling this method!
    @Override
    public int search(int[] array, int target) {
        int size = array.length;
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
