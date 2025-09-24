package GuildCraft.infra.dtos;

import GuildCraft.core.entities.ClassType;
import jakarta.persistence.*;
import lombok.Builder;

@Builder
public record PlayerDto(Long id,
                        String username,
                        Integer power,
                        Integer levelPlayer,
                        ClassType classType, String lore
) {
}