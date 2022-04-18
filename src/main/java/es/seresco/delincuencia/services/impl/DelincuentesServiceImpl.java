package es.seresco.delincuencia.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.seresco.delincuencia.controller.dto.DelincuenteDto;
import es.seresco.delincuencia.controller.dto.NewDelincuenteDto;
import es.seresco.delincuencia.repository.DelincuentesRepository;
import es.seresco.delincuencia.services.DelicuentesService;


@Service
public class DelincuentesServiceImpl implements DelicuentesService {

	@Autowired
	private DelincuentesRepository delincuentesRepository;
	
	
	
	public List<DelincuenteDto> getDelicuentes() {
		
		return delincuentesRepository.findDelincuentes();
	}



	@Override
	public DelincuenteDto getDelicuente(Long idDelincuente) {
		
		return delincuentesRepository.getDelincuente(idDelincuente);
	}



	@Override
	public List<DelincuenteDto> findDelincuentes() {
		
	
		return delincuentesRepository.findDelincuentes();
		
	}


	@Override
	public DelincuenteDto createDelincuente(NewDelincuenteDto newDelincuente) {
		
		return delincuentesRepository.createDelincuente(newDelincuente);
	}



	@Override
	public void deleteDeincuente(Long idDelincuente) {
		
		delincuentesRepository.deleteDeincuente(idDelincuente);
	}
	
}
