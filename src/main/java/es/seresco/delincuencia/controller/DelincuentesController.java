package es.seresco.delincuencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.seresco.delincuencia.controller.dto.DelincuenteDto;
import es.seresco.delincuencia.controller.dto.NewDelincuenteDto;
import es.seresco.delincuencia.services.DelicuentesService;
import io.swagger.annotations.Api;



@Api(tags = {"Delicuentes"})
@RestController
@RequestMapping(path = "/api/delincuentes")
public class DelincuentesController {

	@Autowired
	private DelicuentesService delincuentesService;
	
	// Devuelve un delincuente por id
	@GetMapping(path = "/{idDelincuente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DelincuenteDto> getDelincuente(@PathVariable Long idDelincuente) {
		
		DelincuenteDto delincuente = delincuentesService.getDelicuente(idDelincuente);
		
		if (delincuente != null) {
			return ResponseEntity.status(HttpStatus.OK).body(delincuente);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}

	// Devuelve todos los delincuentes
	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DelincuenteDto>> getListaDelincuentes() {
		
		List<DelincuenteDto> listaDelincuentes = delincuentesService.findDelincuentes();
		if (listaDelincuentes.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); 
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(listaDelincuentes);
		}
	}
	
	// Añade un delincuente
	@PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DelincuenteDto> createDelincuente(@Validated @RequestBody NewDelincuenteDto newDelincuente) {

		DelincuenteDto delincuente = delincuentesService.createDelincuente(newDelincuente);
		
		
		if (delincuente != null) {
			return ResponseEntity.status(HttpStatus.OK).body(delincuente);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	
	
	//Borra un delincuente
	@DeleteMapping(path = "/{idDelincuente}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.NO_CONTENT) 
	public void deleteDelincuente(@PathVariable Long idDelincuente) {

		
	}
	
}
