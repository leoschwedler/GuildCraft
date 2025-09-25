package GuildCraft.infra.beans;

import GuildCraft.core.gateway.PlayerGateway;
import GuildCraft.core.usecases.CreatePlayerUseCase;
import GuildCraft.core.usecases.CreatePlayerUseCaseImpl;
import GuildCraft.core.usecases.GetAllPlayersUseCase;
import GuildCraft.core.usecases.GetAllPlayersUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreatePlayerUseCase CreatePlayerUseCase(PlayerGateway playerGateway){
        return new CreatePlayerUseCaseImpl(playerGateway);
    }

    @Bean
    public GetAllPlayersUseCase GetAllPlayersUseCase(PlayerGateway playerGateway){
        return new GetAllPlayersUseCaseImpl(playerGateway);
    }
}
