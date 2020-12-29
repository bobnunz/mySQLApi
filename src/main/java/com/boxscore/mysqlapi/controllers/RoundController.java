package com.boxscore.mysqlapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxscore.mysqlapi.models.Round;
import com.boxscore.mysqlapi.services.RoundService;

@RestController
@RequestMapping("/api/round")
public class RoundController {
	
	@Autowired
	RoundService roundService;
	
    @GetMapping("/{id}")
    public Round findById(@PathVariable int id) {
    	//Player player =  playerService.getPlayer(id).get();
        return roundService.getRound(id).get();
    }

}
