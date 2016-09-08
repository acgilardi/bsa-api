package com.appmite.bsa.api;

import com.appmite.bsa.models.Player;
import com.appmite.bsa.models.Team;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
public class BsaController {

    private Team team;

    @PostConstruct
    public void init() {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Bob Ball", "pitcher"));
        players.add(new Player("Tom Ball", "First Base"));

        team = new Team("Lions", "Bermuda", players);
    }

    @RequestMapping("/team")
    public @ResponseBody Team resTeam() {
        return team;
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello";
    }
}
