package Service.Rental;

import Model.Rental.Rental;

public interface IRentalService {
    void bookCar(Rental rental);
    void calculateTotalAmount(Rental rental);
    void returnCar(Rental rental);
}
