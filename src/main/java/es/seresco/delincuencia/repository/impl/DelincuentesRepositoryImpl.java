package es.seresco.delincuencia.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.seresco.delincuencia.controller.dto.BandaDto;
import es.seresco.delincuencia.controller.dto.DelincuenteDto;
import es.seresco.delincuencia.controller.dto.NewDelincuenteDto;
import es.seresco.delincuencia.repository.DelincuentesRepository;

@Repository
public class DelincuentesRepositoryImpl implements DelincuentesRepository {

	
	private static List<DelincuenteDto> delincuentes = new ArrayList<>();
	
	static {
		// creamos y añadimos armas, delincuentes y los asignamos a las bandas
		BandaDto bandaPepe = new BandaDto(1001L, "La banda de Pepe", "Madrid", "Los Pepitos", 5);
		
		ArrayList<String> armasVictor = new ArrayList<>();
		armasVictor.add("Escopeta");
		armasVictor.add("Rifle");
		DelincuenteDto delincuenteVictor = new DelincuenteDto(1011L,"Víctor", armasVictor, bandaPepe);
		delincuentes.add(delincuenteVictor); 

		ArrayList<String> armasDani = new ArrayList<>();
		armasDani.add("Nunchacos");
		armasDani.add("Estrellas");
		DelincuenteDto delincuenteDani = new DelincuenteDto(1012L,"Dani", armasDani, bandaPepe);
		delincuentes.add(delincuenteDani);
	}
		
	
	public List<DelincuenteDto> findDelincuentes() {
		
		List<DelincuenteDto> delincuentesEncontrados = new ArrayList<>();

		for (DelincuenteDto delincuente : delincuentes) {
			
				delincuentesEncontrados.add(delincuente);
			}
		return delincuentesEncontrados;
		}
	
	public DelincuenteDto createDelincuente(NewDelincuenteDto newDelincuente) {
		
		DelincuenteDto delincuente = new DelincuenteDto();
		delincuente.setNombre(newDelincuente.getNombre());
		delincuente.setArmas(newDelincuente.getArmas());
		delincuente.setBanda(newDelincuente.getBanda());
		
		
		delincuentes.add(delincuente);
		return delincuente;
		
	}
	
	public void deleteDeincuente(Long idDelincuente) {
		
		DelincuenteDto delincuente = getDelincuente(idDelincuente);
		if (delincuente==null)
			
		delincuentes.remove(delincuente);	
		
	}

	@Override
	public DelincuenteDto getDelincuente(long idDelincuente) {
		for(DelincuenteDto delincuente : delincuentes){
			if(delincuente.getId().equals(idDelincuente)) {
				return delincuente;
			}
		}
		return null;
	}
	}
	

