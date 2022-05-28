package com.optional;

import java.util.Optional;

public class OptionOfNullableExample {

    static Optional<String> ofNullable(){
        Optional<String> name = Optional.ofNullable(null);
        return name;
    }
    static Optional<String> of(){
        Optional<String> name = Optional.of("Pradip");
        return name;
    }
    static Optional<String> empty(){
        Optional<String> name = Optional.empty();
        return name;
    }

    public static void main(String[] args) {

        System.out.println("ofNullable"+ofNullable());
        System.out.println("of"+of());
        System.out.println("empty"+empty());
    }
}
