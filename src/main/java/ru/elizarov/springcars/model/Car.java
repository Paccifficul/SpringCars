package ru.elizarov.springcars.model;


import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id @GeneratedValue private Long id;
    private String brand;
    private String model;
    private int creationYear;
    @Column(unique = true) private String vin;
    private int horsePower;
    private int torqueValue;
    private String fuelType;
    private double engineVolume;
    private double fuelTankVolume;
    private double weight;


    public Car(String brand, String model, int creationYear, String vin) {
        this.brand = brand;
        this.model = model;
        this.creationYear = creationYear;
        this.vin = vin;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public int getCreationYear() {
        return creationYear;
    }

    public int getTorqueValue() {
        return torqueValue;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getFuelTankVolume() {
        return fuelTankVolume;
    }

    public double getWeight() {
        return weight;
    }

    public String getVin() {
        return vin;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setTorqueValue(int torqueValue) {
        this.torqueValue = torqueValue;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setFuelTankVolume(double fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
