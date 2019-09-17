package fr.takima.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampDAO extends CrudRepository<Champ, Integer> {

    //@Modifying
    @Query("SELECT c from Champ c")
    List<Champ> getAllChampId();
}