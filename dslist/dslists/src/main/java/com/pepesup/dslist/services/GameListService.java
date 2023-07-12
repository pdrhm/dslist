package com.pepesup.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pepesup.dslist.dto.GameListDTO;
import com.pepesup.dslist.entities.GameList;
import com.pepesup.dslist.repositories.GameListRepository;

@Component
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		
		return result.stream().map(x -> new GameListDTO(x)).toList();
	
	
	}
	
	}

	


