package Service.Request;

import Model.Request.Request;

public class RequestService implements IRequestService {
    @Override
    public void validateRequest(Request request) {
        System.out.println("Validating the Request : " + request.toString());
    }
}
