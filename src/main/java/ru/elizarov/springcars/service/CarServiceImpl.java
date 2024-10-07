package ru.elizarov.springcars.service;

import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.elizarov.springcars.interfaces.CarRepository;
import ru.elizarov.springcars.interfaces.CarService;
import ru.elizarov.springcars.model.Car;

import java.util.List;

@Service
@Primary
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car findByVin(String vin) {
        return carRepository.findByVin(vin);
    }

    @Override
    public List<Car> findByBrand(String brand) {
        return null;
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    @Transactional
    public void deleteCar(String vin) {
        carRepository.deleteByVin(vin);
    }
}
