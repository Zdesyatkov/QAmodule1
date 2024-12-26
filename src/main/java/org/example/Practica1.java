package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practica1 {
    private String num;

    public Practica1(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num;
    }

    public static void main(String[] args) {

        ArrayList<Practica1> array2 = new ArrayList<>();
        Practica1 one = new Practica1("1");
        Practica1 two = new Practica1("2");
        Practica1 three = new Practica1("3");
        Practica1 four = new Practica1("4");
        Practica1 five = new Practica1("5");
        Practica1 six = new Practica1("6");
        Practica1 seven = new Practica1("7");
        Practica1 eight = new Practica1("8");
        Practica1 nine = new Practica1("9");
        Practica1 ten = new Practica1("10");

        array2.add(one);
        array2.add(two);
        array2.add(three);
        array2.add(four);
        array2.add(five);
        array2.add(six);
        array2.add(seven);
        array2.add(eight);
        array2.add(nine);
        array2.add(ten);


        for (Practica1 array : array2) {
            System.out.println(array);
        }


    }

}
