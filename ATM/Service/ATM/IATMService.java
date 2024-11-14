package Service.ATM;

import Model.ATM.ATM;

public interface IATMService {
    void authenticate(ATM atm);
    void performTransaction(ATM atm);
}
