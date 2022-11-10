package ru.geekbrains.figure;

//И периметр и площадь
public class Triangle extends StretchableFigure implements GettingP, GettingS{

    @Override
    void doScale() {

    }

    @Override
    void doStretch() {

    }

    @Override
    public int getP() {
        return 0;
    }

    @Override
    public int getS() {
        return 0;
    }
}
