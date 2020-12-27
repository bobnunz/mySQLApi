package com.boxscore.mysqlapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxscore.mysqlapi.models.Player;
import com.boxscore.mysqlapi.services.PlayerService;

@RestController
@RequestMapping("/api/player")
public class PlayerController {
	
    @Autowired 
    private PlayerService playerService;

    @GetMapping("/{id}")
    public Player findById(@PathVariable int id) {
        return playerService.getPlayer(id).get();
    }


}
