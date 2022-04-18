package es.seresco.delincuencia.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.seresco.delincuencia.controller.dto.AtracoDto;
import es.seresco.delincuencia.controller.dto.NewAtracoDto;
import es.seresco.delincuencia.repository.AtracoRepository;
import es.seresco.delincuencia.services.AtracoService;

@Service
public class AtracoServiceImpl implements AtracoService {
	
	@Autowired
	private AtracoRepository atracoRepository;	
	
	
	public AtracoDto getAtraco(Long idAtraco) {
		
		return atracoRepository.getAtraco(idAtraco);
	}
	
	public List<AtracoDto> findAtracos (){
		
		return atracoRepository.findAtracos();
	}
	
	public AtracoDto createAtraco(NewAtracoDto  newAtraco) {
		
		return atracoRepository.createAtraco(newAtraco);
	}
	
	public void deleteAtraco(Long idAtraco) {
		
		atracoRepository.deleteAtraco(idAtraco);
	}

}
