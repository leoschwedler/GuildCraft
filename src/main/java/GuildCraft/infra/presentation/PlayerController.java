package GuildCraft.infra.presentation;

import GuildCraft.infra.dtos.PlayerDto;
import GuildCraft.infra.mapper.PlayerMapper;
import GuildCraft.infra.persistence.PlayerEntity;
import GuildCraft.infra.persistence.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("guildCraft/")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerRepository repository;

    @PostMapping("create")
    public ResponseEntity<PlayerDto> createPlayer(@RequestBody PlayerDto request){
        PlayerEntity player = PlayerMapper.map(request);
        player = repository.save(player);
        return ResponseEntity.status(HttpStatus.CREATED).body(PlayerMapper.map(player));
    }
}
