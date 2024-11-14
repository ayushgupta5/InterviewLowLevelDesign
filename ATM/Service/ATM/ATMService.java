package Service.ATM;

import Model.ATM.ATM;

public class ATMService implements IATMService {
    @Override
    public void authenticate(ATM atm) {
        System.out.println("Authenticate the ATM: " + atm.toString());
    }

    @Override
    public void performTransaction(ATM atm) {
        System.out.println("Perform Transaction to this ATM: " + atm.toString());
    }
}
