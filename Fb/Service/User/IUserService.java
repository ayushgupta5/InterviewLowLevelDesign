package Service.User;

import Model.User.User;

public interface IUserService {
    void sendFriendRequest(User user);
    void acceptFriendRequest(User user);
    void login(User user);

}
