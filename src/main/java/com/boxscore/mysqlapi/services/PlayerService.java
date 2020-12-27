package com.boxscore.mysqlapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boxscore.mysqlapi.models.Player;
import com.boxscore.mysqlapi.repositories.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepo;
	
	public Optional<Player> getPlayer(int idPlayer) {
		return playerRepo.findById(idPlayer);
	}

}
