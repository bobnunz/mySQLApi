package com.boxscore.mysqlapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boxscore.mysqlapi.models.Player;

@Repository
@Transactional
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
