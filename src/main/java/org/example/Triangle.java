package org.example;

class Triangle extends Shape {
    public Triangle(Renderer renderer) {
        super(renderer);
    }


    @Override
    public String getName() {
        return "Triangle";
    }

}
