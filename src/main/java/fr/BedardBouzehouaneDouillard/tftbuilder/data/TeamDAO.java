package fr.BedardBouzehouaneDouillard.tftbuilder.app;

import fr.BedardBouzehouaneDouillard.tftbuilder.classes.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDAO extends CrudRepository<Team, Integer> {

}