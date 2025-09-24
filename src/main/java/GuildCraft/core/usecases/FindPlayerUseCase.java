package GuildCraft.core.usecases;

import GuildCraft.core.entities.Player;

public interface FindPlayerUseCase {

    public Player execute(Long playerId);
}
