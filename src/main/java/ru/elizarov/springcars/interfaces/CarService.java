package ru.elizarov.springcars.interfaces;

import ru.elizarov.springcars.model.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCars();
    Car saveCar(Car car);
    Car findByVin(String vin);
    List<Car> findByBrand(String brand);
    Car updateCar(Car car);
    void deleteCar(String vin);
}
