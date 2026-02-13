package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Alien {
    @Id
    private int Aid;
    private String Aname;
    private String tech;

    @OneToMany
    private List<Laptop> laptops;

    public int getAid() {
        return Aid;
    }
    public void setAid(int aid) {
        Aid = aid;}

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }


    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "Aid=" + Aid +
                ", Aname='" + Aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
