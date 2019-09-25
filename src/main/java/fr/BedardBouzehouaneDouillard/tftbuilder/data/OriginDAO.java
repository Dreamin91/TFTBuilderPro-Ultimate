package fr.BedardBouzehouaneDouillard.tftbuilder.data;

import fr.BedardBouzehouaneDouillard.tftbuilder.model.Origin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OriginDAO extends CrudRepository<Origin, Integer> {

}