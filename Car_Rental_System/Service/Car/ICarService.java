package Service.Car;

import Model.Car.Car;

public interface ICarService {
    void addCar(Car car);
    void updateCar(Car car);
    void removeCar(Car car);
    void searchCar(Car car);
}
