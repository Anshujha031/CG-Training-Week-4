package org.example.multiplecatchblock;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            System.out.println("Enter the array");
            int[] arr = (size>0 ? new int[size] : null);
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index");
            int index = sc.nextInt();
            System.out.println(arr[index]);

            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println( "Invalid index " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println( "Array is not initialized " + e.getMessage());
        }

    }
}
