package fr.BedardBouzehouaneDouillard.tftbuilder.data;

import fr.BedardBouzehouaneDouillard.tftbuilder.model.Champ;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampDAO extends CrudRepository<Champ, Integer> {

}