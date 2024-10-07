package ru.elizarov.springcars.controller;


import org.springframework.web.bind.annotation.*;
import ru.elizarov.springcars.interfaces.CarService;
import ru.elizarov.springcars.model.Car;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> findAllCars() {
        return service.findAllCars();
    }

    @PostMapping("/save/car")
    public String saveCar(@RequestBody Car car) {
        service.saveCar(car);

        return car.getBrand() + " " + car.getModel() + " " + car.getCreationYear() + " was successfully added";
    }

    @GetMapping("/get/car/{vin}")
    public Car findByVin(@PathVariable String vin) {
        return service.findByVin(vin);
    }

    @GetMapping("/get/cars/{brand}")
    public List<Car> findByBrand(@PathVariable String brand) {
        return service.findByBrand(brand);
    }

    @PutMapping("/update/car")
    public Car updateCar(Car car) {
        return service.updateCar(car);
    }

    @DeleteMapping("/delete/car/{vin}")
    public void deleteCar(@PathVariable String vin) {
        service.deleteCar(vin);
    }
}
