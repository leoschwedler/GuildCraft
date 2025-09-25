package GuildCraft.infra.mapper;

import GuildCraft.core.entities.Player;
import GuildCraft.infra.persistence.PlayerEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PlayerMapperEntity {

    public static Player map(PlayerEntity playerEntity){
        Player player = new Player(
            playerEntity.getId(),
                playerEntity.getUsername(),
                playerEntity.getPower(),
                playerEntity.getLevelPlayer(),
                playerEntity.getClassType(),
                playerEntity.getLore()
        );
        return player;
    }

    public static PlayerEntity map(Player player){
        return PlayerEntity.builder()
                .id(player.id())
                .username(player.username())
                .power(player.power())
                .levelPlayer(player.levelPlayer())
                .classType(player.classType())
                .lore(player.lore())
                .build();
    }

}
