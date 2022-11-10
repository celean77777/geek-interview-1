package ru.geekbrains.exam;
// не могу придумать отличительные черты легкового авто. Пусть будет просто наследник от Car
public class LightCar extends Car {

    private String carClass;

    public LightCar(){

    }
    public LightCar(String color, String name, String carClass){
        super(color, name);
        this.carClass=carClass;
    }


    @Override
    void open() {

    }

    @Override
    void move() {

    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
}
