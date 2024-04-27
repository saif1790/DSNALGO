package com.java8.feature;

public class ChildImpl implements child {
    public static void main(String[] args) {

        child child = new ChildImpl();
        int sum = child.sum();
        System.out.println(sum);
    }

    public int sum() {
        return 0;
    }
}
