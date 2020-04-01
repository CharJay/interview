package com.charjay.java.java8.formula;

public class Test {
    public static void main(String[] args) {
        // TODO 通过匿名内部类方式访问接口
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100));     // 100.0 1
        System.out.println(formula.sqrt(16));           // 4.0

    }
}
