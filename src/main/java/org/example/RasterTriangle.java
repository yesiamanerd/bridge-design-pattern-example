package org.example;


class RasterTriangle extends Triangle
{
    public RasterTriangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String toString()
    {
        return String.format("Drawing %s as pixels", getName());
    }
}