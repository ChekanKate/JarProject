package com.chekan;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hello!");
        OrderedMap<String, String> map = new LinkedMap<String, String>();
        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");
        System.out.println(map.firstKey());
        System.out.println(map.nextKey("One"));
        System.out.println(map.nextKey("Two"));
        System.out.println("--------------------------------------------");
        NestedClassesCar.Engine engine = new NestedClassesCar.Engine(256);
        System.out.println(engine);
        NestedClassesCar car = new NestedClassesCar("red", 2, engine);
        System.out.println(car);
        car.methodForLocalClass();
        car.methodForAnonClass();
        System.out.println("--------------------------------------------");
        AnonVSLambda anonVSLambda = new AnonVSLambda();
        anonVSLambda.main();

    }
}
