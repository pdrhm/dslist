package com.pepesup.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pepesup.dslist.dto.GameMinDTO;
import com.pepesup.dslist.entities.Game;
import com.pepesup.dslist.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return result;
	
	
	}
	
	}

	


