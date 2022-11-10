package ru.geekbrains.figure;

// Родитель для как масштабируемых, так и растягиваемых фигур. В нашем случае - треугольник
public abstract class StretchableFigure extends ScalableFigure {
    abstract void doStretch();
}
