package com.appmite.bsa.models;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TeamDao extends CrudRepository<Team, Long> {

    List<Team> findAll();

    public Team findByName(String name);
}
