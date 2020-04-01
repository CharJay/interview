package com.charjay.java.java8.functioninc;


public class Test {
    public static void main(String[] args) {
        // TODO 将数字字符串转换为整数类型
        //函数式接口(Functional Interfaces)
        {
            Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
            Integer converted = converter.convert("123");
            System.out.println(converted);
            System.out.println(converted.getClass()); //class java.lang.Integer
        }
        System.out.println("=============");
        //方法和构造函数引用(Method and Constructor References)
        {
            Converter<String, Integer> converter = Integer::valueOf;
            Integer converted = converter.convert("123");
            System.out.println(converted.getClass());   //class java.lang.Integer
        }

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");


    }
}
