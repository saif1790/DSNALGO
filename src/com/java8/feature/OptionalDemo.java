package com.java8.feature;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        int id = 1;
        Optional<String> name = getName(1);
        String aDefault = name.orElse("default");
        name.ifPresent(x-> System.out.println(x));
        System.out.println(aDefault);
    }

    private static Optional<String> getName(int i) {
        String name = null;
        return Optional.ofNullable(name);

    }
}
