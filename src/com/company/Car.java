package com.company;

public class Car {
   private int speed;
     private String color;
   private String model;
   private  Engine engine;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public  Car(String c){
    color=c;
    System.out.println("i am creating by constructor ");
}
public  Car(){}
public Car( int speed,String color){

}

    public Car(int speed, String color, String model, Engine engine) {
        this.speed = speed;
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    void trunon(){
        System.out.println("i am open the cay using keys");
    }
    void trunoff(){
        System.out.println("i am close the cay using keys");
    }
}
