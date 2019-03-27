package com.company.quiz;

public class Test2 {
    private void method1() {
        MyClass obj = new MyClass();
        obj.x = 1;
        method2(obj);
        System.out.println("obj.x=" + obj.x);
    }

    private void method2(MyClass param) {
        param.x = 2;
        param = new MyClass();
        param.x = 3;
    }

    class MyClass {
        int x;
    }

    public static void main(String[] args) {
        new Test2().method1();
    }
}