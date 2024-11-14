package Service.Player;

import Model.Player.Player;

public class PlayerService implements IPlayerService {
    @Override
    public void getPoints(Player player) {
        System.out.println("Getting the Points : " +player.toString());
    }
}
