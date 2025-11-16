package algorithms;

public class InterpolationSearch implements SearchPattern {
    @Override
    public int search(int[] array, int target) {
        low = 0;
        high = array.length - 1;

        while (low <= high && target >= array[low] && target <= array[high]) {
            if (array[low] == array[high]) {
                if (array[low] == target) return low;
                return -1;
            }

            int position = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[position] == target) {
                return position;
            }
            else if (array[position] < target) {
                low = position + 1;
            }
            else {
                high = position - 1;
            }
        }
        return -1;
        }
    }
}