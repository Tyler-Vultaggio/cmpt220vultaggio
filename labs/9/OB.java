//Tyler Vultaggio
//4/24/20
//Lab 9

import java.util.*;

public class OB {
    public static void main(String[] args) {

        int[] array = new int[100];
        for(int i = 0; i < 100; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");

        try {
            System.out.println("The corresponding element value is: " + 
                array[input.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}