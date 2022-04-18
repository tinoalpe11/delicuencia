package es.seresco.delincuencia.repository;

import java.util.List;

import es.seresco.delincuencia.controller.dto.DelincuenteDto;
import es.seresco.delincuencia.controller.dto.NewDelincuenteDto;

public interface DelincuentesRepository {

	
	public DelincuenteDto getDelincuente(long idDelincuente);
	
	public List<DelincuenteDto> findDelincuentes();
	
	public DelincuenteDto createDelincuente(NewDelincuenteDto newDelincuente);
	
	public void deleteDeincuente(Long idDelincuente);
}
