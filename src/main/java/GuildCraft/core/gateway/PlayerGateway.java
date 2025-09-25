package GuildCraft.core.gateway;


import GuildCraft.core.entities.Player;

import java.util.List;

public interface PlayerGateway {

    public Player createPlayer(Player player);

    public List<Player> getAllPlayers();
}
