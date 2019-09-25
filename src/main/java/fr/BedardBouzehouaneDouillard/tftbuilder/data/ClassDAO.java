package fr.BedardBouzehouaneDouillard.tftbuilder.data;

import fr.BedardBouzehouaneDouillard.tftbuilder.model.Class;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDAO extends CrudRepository<Class, Integer> {

}