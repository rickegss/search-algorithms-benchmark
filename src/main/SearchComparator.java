package main;
import java.util.Arrays;
import java.util.Scanner;
import data.ArrayGenerator;

public class SearchComparator {
    public static void main(String[] args){
        int array_size = UserInput();
        int[] random_array = ArrayGenerator.GenerateRandomArray(array_size);
        System.out.printf("Random array of size %d : %s%n", array_size, Arrays.toString(random_array));
    }

    public static int UserInput(){
        System.out.println("Please insert the desired size of the array (n elements): ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        return size;
    }
}
