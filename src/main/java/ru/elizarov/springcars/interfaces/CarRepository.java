package ru.elizarov.springcars.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.elizarov.springcars.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByVin(String vin);
    void deleteByVin(String vin);
}
