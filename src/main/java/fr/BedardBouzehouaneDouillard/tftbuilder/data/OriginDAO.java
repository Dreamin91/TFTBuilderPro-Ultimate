package fr.BedardBouzehouaneDouillard.tftbuilder.app;

import fr.BedardBouzehouaneDouillard.tftbuilder.classes.Origin;
import fr.BedardBouzehouaneDouillard.tftbuilder.classes.Origin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OriginDAO extends CrudRepository<Origin, Integer> {

}