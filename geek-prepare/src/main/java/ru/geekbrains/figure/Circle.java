package ru.geekbrains.figure;

//У окружности периметра нет(хотя есть длина...)
public class Circle extends ScalableFigure implements GettingS{

    @Override
    void doScale() {

    }

    @Override
    public int getS() {
        return 0;
    }
}
