package fr.BedardBouzehouaneDouillard.tftbuilder.data;

import fr.BedardBouzehouaneDouillard.tftbuilder.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDAO extends CrudRepository<Team, Integer> {

}