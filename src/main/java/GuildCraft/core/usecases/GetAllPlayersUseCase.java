package GuildCraft.core.usecases;

import GuildCraft.core.entities.Player;

import java.util.List;

public interface GetAllPlayersUseCase {

    public List<Player> execute();
}
