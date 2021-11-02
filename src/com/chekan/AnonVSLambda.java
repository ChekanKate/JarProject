package com.chekan;

import java.util.stream.StreamSupport;

public class AnonVSLambda {
    private int x = 5;
    int c = 5;
    public void main(){
        Math<Integer> m1 = new Math<Integer>() {
            int c = 10;
            void abc(){}
            @Override
            public Integer doOperation(Integer a, Integer b) {
                AnonVSLambda anonVSLambda = new AnonVSLambda();
                System.out.println("this.c = " + this.c);
                return a+b+anonVSLambda.x;
            }
        };

        Math<Double> m2 = new Math<Double>() {
            @Override
            public Double doOperation(Double a, Double b) {
                return a*b;
            }
        };

        System.out.println("First anon class : " + m1.doOperation(3,6));
        System.out.println("Second anon class : " + m2.doOperation(3.5,6.1));

        Math<Integer> math = (Integer a, Integer b) -> {
            return a * b - c + x;
        };

        System.out.println("Lambda's res : " + math.doOperation(10, 2));
    }



}

interface Math <T>{
    T doOperation(T a, T b);
}