package algorithms;

public class LinearSearch {
    // No need to sort array before method.

    public int search(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
