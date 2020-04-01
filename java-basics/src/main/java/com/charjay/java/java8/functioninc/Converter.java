package com.charjay.java.java8.functioninc;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
