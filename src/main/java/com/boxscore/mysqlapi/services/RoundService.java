package com.boxscore.mysqlapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boxscore.mysqlapi.models.Round;
import com.boxscore.mysqlapi.repositories.RoundRepository;

@Service
public class RoundService {

	@Autowired
	RoundRepository roundRepo;
	
	public Optional<Round> getRound (int idRound) {
		return roundRepo.findById(idRound);
	}
}
