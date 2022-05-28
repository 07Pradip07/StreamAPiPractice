package com.optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("helo");
        System.out.println(optional.isPresent());
    }
}
