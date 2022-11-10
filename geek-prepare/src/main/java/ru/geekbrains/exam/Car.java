package ru.geekbrains.exam;

//Все автомабили заводятся (starting), двигаются (moving), останавливаются (stopping)
//        и открываются (open). Возможно, целесообразней соответствующие методы вынести
//        в класс родителя. А в интерфейсы поместить специфические для возможных наследников методы.


public abstract class Car {
   // public Engine engine; Поля не должны быть public
    private String color;
    private String name;

    // Я бы добавил конструктор. Все наследники Car имеют цвет и имя, присоздании экземпляра
    //наследника можно сразу инициализировать эти поля.
    public Car(){

    }

    public Car(String color, String name){
        this.color=color;
        this.name=name;
    }
    // Пусть заводятся и останавливаются все одинако. Пусть будут Protected. Хотя
    // и в public ничего криминального не вижу
    protected final void start() {
        System.out.println("Car starting");
    }
    protected final void stop() {
        System.out.println("Car stopping");
    }

    // Двигаются и открываются по разному. Но двигаются и открываются.
    abstract void open();
    abstract void move();

    // Здесь вроде нормуль
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
