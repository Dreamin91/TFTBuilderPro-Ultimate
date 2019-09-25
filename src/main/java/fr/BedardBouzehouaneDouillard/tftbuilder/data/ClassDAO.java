package fr.BedardBouzehouaneDouillard.tftbuilder.app;

import fr.BedardBouzehouaneDouillard.tftbuilder.classes.Class;
import fr.BedardBouzehouaneDouillard.tftbuilder.classes.Class;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDAO extends CrudRepository<Class, Integer> {

}