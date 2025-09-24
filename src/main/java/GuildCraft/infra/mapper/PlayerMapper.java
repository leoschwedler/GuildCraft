package GuildCraft.infra.mapper;

import GuildCraft.infra.dtos.PlayerDto;
import GuildCraft.infra.persistence.PlayerEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PlayerMapper {

    public static PlayerEntity map(PlayerDto request){
        return PlayerEntity.builder()
                .id(request.id())
                .username(request.username())
                .power(request.power())
                .levelPlayer(request.levelPlayer())
                .classType(request.classType())
                .lore(request.lore())
                .build();
    }

    public static PlayerDto map(PlayerEntity playerEntity){
        return PlayerDto.builder()
                .id(playerEntity.getId())
                .username(playerEntity.getUsername())
                .power(playerEntity.getPower())
                .levelPlayer(playerEntity.getLevelPlayer())
                .classType(playerEntity.getClassType())
                .lore(playerEntity.getLore())
                .build();
    }
}
