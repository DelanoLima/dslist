package com.limadelano.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limadelano.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
