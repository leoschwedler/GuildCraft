package GuildCraft.core.entities;

import java.io.Serializable;

public record Player(Long id, String username, Integer power, Integer levelPlayer, ClassType classType, String lore) implements Serializable {
}
