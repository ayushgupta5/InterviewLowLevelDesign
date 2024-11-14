package Service.Car;

import Model.Car.Car;

public class CarService implements ICarService {
    @Override
    public void addCar(Car car) {
        System.out.println("Car is Added : " + car.toString());
    }

    @Override
    public void updateCar(Car car) {
        System.out.println("Car is Updated : " + car.toString());
    }

    @Override
    public void removeCar(Car car) {
        System.out.println("Car is Removed : " + car.toString());
    }

    @Override
    public void searchCar(Car car) {
        System.out.println("Searching the Car : " + car.toString());
    }
}
