package com.pepesup.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pepesup.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
