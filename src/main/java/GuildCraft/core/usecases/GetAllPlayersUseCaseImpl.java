package GuildCraft.core.usecases;

import GuildCraft.core.entities.Player;
import GuildCraft.core.gateway.PlayerGateway;

import java.util.List;

public class GetAllPlayersUseCaseImpl implements GetAllPlayersUseCase{

    private final PlayerGateway playerGateway;

    public GetAllPlayersUseCaseImpl(PlayerGateway playerGateway) {
        this.playerGateway = playerGateway;
    }

    @Override
    public List<Player> execute() {
        return playerGateway.getAllPlayers();
    }
}
