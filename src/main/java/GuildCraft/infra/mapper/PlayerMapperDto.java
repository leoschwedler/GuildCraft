package GuildCraft.infra.mapper;

import GuildCraft.core.entities.Player;
import GuildCraft.infra.dtos.PlayerDto;
import GuildCraft.infra.persistence.PlayerEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PlayerMapperDto {

    public static Player map(PlayerDto playerDto){
         Player player = new Player(
                 playerDto.id(),
                 playerDto.username(),
                 playerDto.power(),
                 playerDto.levelPlayer(),
                 playerDto.classType(),
                 playerDto.lore()
         );
         return player;
    }

    public static PlayerDto map(Player player){
        return PlayerDto.builder()
                .id(player.id())
                .username(player.username())
                .power(player.power())
                .levelPlayer(player.levelPlayer())
                .classType(player.classType())
                .lore(player.lore())
                .build();
    }
}
