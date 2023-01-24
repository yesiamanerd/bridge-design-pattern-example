package org.example;


class VectorTriangle extends Triangle
{
    public VectorTriangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String toString()
    {
        return String.format("Drawing %s as lines", getName());
    }
}
