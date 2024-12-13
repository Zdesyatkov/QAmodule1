package org.example;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 7; i++) {
            if (array[i] == 5) {
                break;
            }
            System.out.println(array[i]);
        }
    }

}