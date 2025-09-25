package GuildCraft.infra.presentation;

import GuildCraft.core.entities.Player;
import GuildCraft.core.usecases.CreatePlayerUseCase;
import GuildCraft.core.usecases.GetAllPlayersUseCase;
import GuildCraft.infra.dtos.PlayerDto;
import GuildCraft.infra.mapper.PlayerMapperDto;
import GuildCraft.infra.persistence.PlayerEntity;
import GuildCraft.infra.persistence.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("guildCraft/")
@RequiredArgsConstructor
public class PlayerController {

    private final CreatePlayerUseCase createPlayerUseCase;
    private final GetAllPlayersUseCase getAllPlayersUseCase;

    @PostMapping("create")
    public ResponseEntity<PlayerDto> createPlayer(@RequestBody PlayerDto request){
        Player player = createPlayerUseCase.execute(PlayerMapperDto.map(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(PlayerMapperDto.map(player));
    }

    @GetMapping("getAll")
    public ResponseEntity<List<PlayerDto>> getAllPlayers(){
        List<Player> players = getAllPlayersUseCase.execute();
        return ResponseEntity.status(HttpStatus.OK).body(players.stream().map(PlayerMapperDto::map).collect(Collectors.toList()));
    }
}
