package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Triangle(new RasterRenderer()).toString()); // returns "Drawing Triangle as pixels"
        System.out.println(new Square(new VectorRenderer()).toString()); // returns "Drawing Square as lines"
    }
}


