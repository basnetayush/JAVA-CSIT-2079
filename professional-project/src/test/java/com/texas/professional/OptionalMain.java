package com.texas.professional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
//        String normalString = getNormalString();
//        normalString.concat("World");

        Optional<String> optionalString = getOptionalString();
        if (optionalString.isPresent()){
            System.out.println(optionalString.get());
        }else{
            System.out.println("Empty");
        }
    }

    public static Optional<String> getOptionalString() {
        return Optional.ofNullable(null);
    }

    public static String getNormalString() {
        return null;
    }
}
