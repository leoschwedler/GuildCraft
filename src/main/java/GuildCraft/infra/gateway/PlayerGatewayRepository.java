package GuildCraft.infra.gateway;

import GuildCraft.core.entities.Player;
import GuildCraft.core.gateway.PlayerGateway;
import GuildCraft.infra.mapper.PlayerMapperEntity;
import GuildCraft.infra.persistence.PlayerEntity;
import GuildCraft.infra.persistence.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PlayerGatewayRepository implements PlayerGateway {

    private final PlayerRepository repository;

    @Override
    public Player createPlayer(Player player) {
        PlayerEntity playerEntity = PlayerMapperEntity.map(player);
        playerEntity = repository.save(playerEntity);
        return PlayerMapperEntity.map(playerEntity);
    }

    @Override
    public List<Player> getAllPlayers() {
        List<PlayerEntity> players = repository.findAll();
        return players.stream().map(PlayerMapperEntity::map).collect(Collectors.toList());
    }
}
