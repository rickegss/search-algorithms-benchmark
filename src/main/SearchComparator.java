package main;
import java.util.Arrays;
import java.util.Scanner;

import algorithms.*;
import utils.Timer;
import data.ArrayGenerator;

public class SearchComparator {
    public static void main(String[] args) {
        int array_size = userInput();
        int[] random_array = ArrayGenerator.generateRandomArray(array_size);
        int target = ArrayGenerator.existingTarget(random_array);
        int out_target = ArrayGenerator.nonExistingTarget(random_array);
        int[] sorted_array = Arrays.copyOf(random_array, random_array.length);
        Arrays.sort(sorted_array);

        printHeader("📊 ARRAY & TARGET INFO");

        System.out.printf("• Array size........... %d%n", array_size);
        System.out.printf("• Random array......... %s%n", Arrays.toString(random_array));
        System.out.printf("• Target (exists)...... %d%n", target);
        System.out.printf("• Target (not exists).. %d", out_target);
        System.out.println(" ");

        SearchPattern linear = new LinearSearch();
        SearchPattern binary = new BinarySearch();
        SearchPattern jump = new JumpSearch();
        SearchPattern interpolation = new InterpolationSearch();

        printHeader("🔍 LINEAR SEARCH");
        long tLinear1 = executeSearch(linear, random_array, target);
        long tLinear2 = executeSearch(linear, random_array, out_target);

        printHeader("🔍 BINARY SEARCH (sorted array)");
        long tBinary1 =executeSearch(binary, sorted_array, target);
        long tBinary2 =executeSearch(binary, sorted_array, out_target);

        printHeader("🔍 JUMP SEARCH (sorted array)");
        long tJump1 =executeSearch(jump, sorted_array, target);
        long tJump2 =executeSearch(jump, sorted_array, out_target);

        printHeader("🔍 INTERPOLATION SEARCH (sorted array)");
        long tInterp1 =executeSearch(interpolation, sorted_array, target);
        long tInterp2 =executeSearch(interpolation, sorted_array, out_target);


        long[] times1 = { tLinear1, tBinary1, tJump1, tInterp1};
        long[] times2 = {tLinear2, tBinary2, tJump2, tInterp2 };
        String[] names = {
                "LinearSearch",
                "BinarySearch",
                "JumpSearch",
                "InterpolationSearch"
        };

        long best1 = times1[0];
        int bestIndex1 = 0;

        for (int i = 1; i < times1.length; i++) {
            if (times1[i] < best1) {
                best1 = times1[i];
                bestIndex1 = i;
            }
        }

        long best2 = times2[0];
        int bestIndex2 = 0;

        for (int i = 1; i < times2.length; i++) {
            if (times2[i] < best2) {
                best2 = times2[i];
                bestIndex2 = i;
            }
        }

        printHeader("🏆 FASTEST ALGORITHM [with inner target]");
        System.out.printf("• Winner: %s%n", names[bestIndex1]);
        System.out.printf("• Time: %d ns%n", best1);

        printHeader("🏆 FASTEST ALGORITHM [with outer target]");
        System.out.printf("• Winner: %s%n", names[bestIndex2]);
        System.out.printf("• Time: %d ns%n", best2);

    }

    public static int userInput() {
        System.out.print("Enter array size: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void printHeader(String title) {
        String bar = "═".repeat(100);
        System.out.println("\n" + bar);
        System.out.printf("  %s%n", title);
        System.out.println(bar);
    }

    public static long executeSearch(SearchPattern algorithm, int[] array, int target) {
        Timer timer = new Timer();

        System.out.println("\n" + "─".repeat(100));
        System.out.printf("▶▶ Running: %s%n", algorithm.getClass().getSimpleName());
        System.out.printf("▶ Target : %d%n", target);
        System.out.println("─".repeat(100));

        timer.start();
        int result = algorithm.search(array, target);
        timer.stop();

        if (result != -1) {
            System.out.printf("✓ Found at index %d%n", result);
        } else {
            System.out.println("✗ Target not found");
        }

        System.out.printf("⏱ Time: %d ns%n", timer.elapsedNano());
        System.out.printf("⏱ Time: %.6f ms%n", timer.elapsedMillis());

        System.out.println("─".repeat(100));

        return timer.elapsedNano();
    }
}
