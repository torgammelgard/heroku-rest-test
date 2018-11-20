package se.torgammelgard.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "players", path = "players")
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {
    List<Player> findAllByFirstNameContains(@Param("name") String name);
}
