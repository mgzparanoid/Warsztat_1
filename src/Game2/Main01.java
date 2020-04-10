package Game2;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int[] array = new int[6];
        int[] arrayNew = new int[6];
        for (int i = 0; i < arrayNew.length; i++) {
            array[i] = arrayNew[i];
        }

        Scanner scan = new Scanner(System.in);

        int counter = 0;
        System.out.println("Enter 6 numbers from 1 to 49: ");
        while (counter < 6) {
            System.out.println("Enter " + (counter + 1) + " number");
            while (!scan.hasNextInt()){
                scan.next();
                System.out.println("Please enter a number.");
            }
            int value = scan.nextInt();
            if(ArrayUtils.contains(arrayNew, value)){
                System.out.println("You've already entered this number.");
                continue;
            }
            arrayNew[counter] = value;
            counter++;
        }
//        Random r = new Random();
//        int randomNumber = r.nextInt(50 - 1) + 1;
//        Scanner scan = new Scanner(System.in);
//
//
//        System.out.println(Arrays.toString(arr));
//        Collections.shuffle(Arrays.asList(arr));
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("Select 6 numbers from 1 to 49: ");
//        while(!scan.hasNextInt()){
//            System.out.println("Numbers only, enter again: ");
    }
}

