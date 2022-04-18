package es.seresco.delincuencia.repository;

import java.util.List;

import es.seresco.delincuencia.controller.dto.AtracoDto;
import es.seresco.delincuencia.controller.dto.NewAtracoDto;

public interface AtracoRepository {
	
	public AtracoDto getAtraco(long id);
	
	public List<AtracoDto> findAtracos();
	
	public AtracoDto createAtraco(NewAtracoDto newAtraco);
	
	public void deleteAtraco(Long idAtraco);
	

}
