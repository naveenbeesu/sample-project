package com.example.carmarketplace.service;

import com.example.carmarketplace.model.Car;
import com.example.carmarketplace.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCar(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public List<Car> getTop5UsedForSale() {
        return carRepository.findTop5ByStatusAndType("used", "sale");
    }

    public List<Car> getTop5NewForLease() {
        return carRepository.findTop5ByStatusAndType("new", "lease");
    }
}