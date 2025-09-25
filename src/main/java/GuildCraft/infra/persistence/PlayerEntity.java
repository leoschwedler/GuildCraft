package GuildCraft.infra.persistence;

import GuildCraft.core.entities.ClassType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_player")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private Integer power;
    private Integer levelPlayer;
    @Enumerated(EnumType.STRING)
    private ClassType classType;
    private String lore;
}
