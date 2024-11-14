package Service.Rental;

import Model.Rental.Rental;

public class RentalService implements IRentalService {
    @Override
    public void bookCar(Rental rental) {
        System.out.println("Book the Car : " + rental.toString());
    }

    @Override
    public void calculateTotalAmount(Rental rental) {
        System.out.println("Calculate the Total Amount for the Rental : " + rental.toString());
    }

    @Override
    public void returnCar(Rental rental) {
        System.out.println("Return the Car for Rental : " + rental.toString());
    }
}
