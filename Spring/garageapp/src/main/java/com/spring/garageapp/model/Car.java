package com.spring.garageapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW
    }

    @Id
    private long id;
    private String model;
    private String brand;

    private int released_year;
    private Car.Color Color;

    public Car(){

    }

    public Car(long id, String model, String brand, int released_year, Car.Color color) {
        super();
        this.id=id;
        this.model = model;
        this.brand = brand;
        this.released_year = released_year;
        Color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getReleased_year() {
        return released_year;
    }

    public void setReleased_year(int released_year) {
        this.released_year = released_year;
    }

    public Car.Color getColor() {
        return Color;
    }

    public void setColor(Car.Color color) {
        Color = color;
    }
}
