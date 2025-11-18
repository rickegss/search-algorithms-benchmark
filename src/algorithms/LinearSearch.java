package algorithms;

public class LinearSearch implements SearchPattern {
    // No need to sort array before method.
    @Override
    public int search(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Linear Search";
    }

}
