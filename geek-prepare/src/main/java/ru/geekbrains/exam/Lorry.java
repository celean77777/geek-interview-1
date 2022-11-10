package ru.geekbrains.exam;


// class Lorry extends Car, Moveable, Stopable - В оригинале забыли implements перед интерфейсами
// Грузовику имплементируем дополнительные методы через интерфейсы
public class Lorry extends Car implements Loadable, Unloadable{

    private int loadCapacity;

    public Lorry(){

    }
    public Lorry(String color, String name, int loadCapacity){
        super(color, name);
        this.loadCapacity=loadCapacity;
    }

    @Override
    void open() {
        System.out.println("Lorry opening");
    }

    @Override
    void move() {
        System.out.println("Lorry moving");
    }

    @Override
    public void load() {
        System.out.println("Lorry loading");
        // Можно какие-нибудь условия проверять
    }

    @Override
    public void unload() {
        System.out.println("Lorry unloading");
    }
}
