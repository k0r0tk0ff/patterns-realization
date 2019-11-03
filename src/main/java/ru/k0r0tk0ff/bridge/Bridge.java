package ru.k0r0tk0ff.bridge;

public class Bridge {
    public static void main(String[] args) {

        Vehicle vehicle = new Car(new Audi());
        vehicle.track();
    }

}

abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void track();
}

interface Model {
    void track(String message);
}

class Car extends Vehicle {
    public Car(Model model) {
        super(model);
    }

    @Override
    public void track() {
        model.track("Сar ");
    }
}

class Audi implements Model {
    @Override
    public void track(String message) {
        System.out.println(message + "Audi");
    }
}


