package com.chekan;

public class NestedClassesCar {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public NestedClassesCar(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        int horsePower;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine : {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public static void methodForLocalClass(){
        class Tractor implements SoundAble{
            @Override
            public String makeSound(){
                return "R-RR";
            }
        }
        Tractor t = new Tractor();
        System.out.println("Local class : " + t.makeSound());
    }

    public static void methodForAnonClass(){
        SoundAble racingCar = new SoundAble() {
            String owner;
            void abc(){}
            @Override
            public String makeSound() {
                return "Vroom";
            }
        };
        System.out.println("Anonymous class : " + racingCar.makeSound());
    }

}

interface SoundAble{
    String makeSound();
}