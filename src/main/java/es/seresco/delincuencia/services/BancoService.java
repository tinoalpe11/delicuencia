package es.seresco.delincuencia.services;

import java.util.List;

import es.seresco.delincuencia.controller.dto.BancoDto;
import es.seresco.delincuencia.controller.dto.NewBancoDto;

public interface BancoService {

	BancoDto getBanco(Long idBanco);

	List<NewBancoDto> findBancos();
	 
	/*BancoDto createBanco(NewBancoDto newBanco);
	
	void deleteBanco(Long idBanco);
	
	*/
}
