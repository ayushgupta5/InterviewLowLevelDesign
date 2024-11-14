package Service.User;

import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void sendFriendRequest(User user) {
        System.out.println("Sending the friend Request : " +user.toString());
    }

    @Override
    public void acceptFriendRequest(User user) {
        System.out.println("Accepting the Friend Request : " +user.toString());
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging in : " +user.toString());
    }
}
