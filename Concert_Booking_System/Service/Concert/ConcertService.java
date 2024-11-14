package Service.Concert;

import Model.Concert.Concert;

public class ConcertService implements IConcertService {
    @Override
    public void searchConcerts(Concert concert) {
        System.out.println("Searching the Concert : " + concert.toString());
    }
}
