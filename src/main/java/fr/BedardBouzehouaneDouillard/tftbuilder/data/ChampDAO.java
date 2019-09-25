package fr.BedardBouzehouaneDouillard.tftbuilder.app;

import fr.BedardBouzehouaneDouillard.tftbuilder.classes.Champ;
import fr.BedardBouzehouaneDouillard.tftbuilder.classes.Champ;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampDAO extends CrudRepository<Champ, Integer> {

    //@Modifying
    //@Query("SELECT c from Champ c")
    //List<Champ> getAllChampId();
}