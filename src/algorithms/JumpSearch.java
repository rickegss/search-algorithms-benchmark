package algorithms;

public class JumpSearch implements SearchPattern {
    // Array must be sorted!
    @Override
    public int search(int[] array, int target){
        int size = array.length;
        int step = (int) Math.sqrt(size);
        int jump = step;
        int prev = 0;

        while(array[Math.min(jump, size) - 1] < target) {
            prev = jump;
            jump += step;

            if (prev >= size) {
                return -1;
            }
        }

        for (int i = prev; i < Math.min(jump, size); i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
