package com.devix.www;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(100);
        v.add(1000);

        for (int value : v) {
            System.out.println(value);
        }
    }
}
