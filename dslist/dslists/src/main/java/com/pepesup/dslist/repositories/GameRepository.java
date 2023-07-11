package com.pepesup.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pepesup.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
