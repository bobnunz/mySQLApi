package com.boxscore.mysqlapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boxscore.mysqlapi.models.Round;

@Repository
@Transactional
public interface RoundRepository extends JpaRepository<Round, Integer>{

}
