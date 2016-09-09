package com.appmite.bsa.api;

import com.appmite.bsa.models.Player;
import com.appmite.bsa.models.Team;
import com.appmite.bsa.models.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@RestController
public class TeamController {

    @Autowired
    private TeamDao teamDao;

    @PostConstruct
    public void init() {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Bob Jones", "pitcher"));
        players.add(new Player("Joe Juice", "catcher"));

        Team team = new Team("bears", "Canada", players);
        teamDao.save(team);
    }

    @RequestMapping("/teams/{name}")
    public Team resTeam(@PathVariable String name) {
        return teamDao.findByName(name);
        //return new Team();
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello";
    }
}
