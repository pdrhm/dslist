package com.pepesup.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pepesup.dslist.dto.GameDTO;
import com.pepesup.dslist.dto.GameMinDTO;
import com.pepesup.dslist.entities.Game;
import com.pepesup.dslist.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	
	}
	
	}

	


