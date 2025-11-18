package data;

import java.util.Random;

public class ArrayGenerator {

    public static int[] generateRandomArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static int existingTarget(int[] array) {
        Random random = new Random();
        int array_size = array.length;
        int random_index = random.nextInt(array_size);
        int target = array[random_index];

        return target;
    }

    public static int nonExistingTarget(int[] array) {
        Random random = new Random();
        while (true) {
            int non_target = random.nextInt(2000);
            boolean exists = false;

            for (int i = 0; i < array.length; i++) {
                if (non_target == array[i]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                return non_target;
            }
        }
    }
}
