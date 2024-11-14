package Service.Player;

import Model.Player.Player;

public class PlayerService implements IPlayerService {
    @Override
    public void getStatistics(Player player) {
        System.out.println("Getting the Statistics of the Player : " + player.toString());
    }
}
