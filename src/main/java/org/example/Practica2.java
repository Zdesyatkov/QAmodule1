package org.example;

public class Practica2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 7; i++) {
            if (array1[i] == 5) {
                break;
            }
            System.out.println(array1[i]);
        }
    }
}
