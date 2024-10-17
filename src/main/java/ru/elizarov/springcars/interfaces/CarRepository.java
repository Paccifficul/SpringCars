package ru.elizarov.springcars.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.elizarov.springcars.model.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByVin(String vin);
    List<Car> findByBrand(String brand);
    void deleteByVin(String vin);
}
