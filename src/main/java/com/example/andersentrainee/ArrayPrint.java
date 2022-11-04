package com.example.andersentrainee;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int elements = scan.nextInt();
        int[] array = new int[elements];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введенный массив: " + Arrays.toString(array));
        System.out.println("Элементы массива кратные 3: ");
        ArrayPrintMethod(array);
    }

    public static void ArrayPrintMethod(int[] array) {
        for (int i=0; i<array.length;i++) {
            if (array[i]==0)
                continue;
            if (array[i] % 3 == 0)
                System.out.print(array[i] + "; ");
        }
    }
}