package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int Lid;
    private String brand;
    private String model;
    private int ram;



    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }



    @Override
    public String toString() {
        return "Laptop{" +
                "Lid=" + Lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
