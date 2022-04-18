package es.seresco.delincuencia.services;

import java.util.List;

import es.seresco.delincuencia.controller.dto.AtracoDto;
import es.seresco.delincuencia.controller.dto.NewAtracoDto;

public interface AtracoService {
	
	AtracoDto getAtraco(Long idAtraco);
	
	List<AtracoDto> findAtracos (); 

	AtracoDto createAtraco(NewAtracoDto newAtraco);
	
	void deleteAtraco(Long idAtraco);
}
