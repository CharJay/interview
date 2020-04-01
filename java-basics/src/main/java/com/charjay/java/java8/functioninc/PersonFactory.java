package com.charjay.java.java8.functioninc;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
