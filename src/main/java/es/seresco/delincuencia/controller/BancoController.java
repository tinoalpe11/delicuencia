package es.seresco.delincuencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.seresco.delincuencia.controller.dto.BancoDto;
import es.seresco.delincuencia.controller.dto.NewBancoDto;
import es.seresco.delincuencia.services.BancoService;
import io.swagger.annotations.Api;

@Api(tags= {"Bancos"})
@RestController
@RequestMapping(path="/api/banco")
public class BancoController {
	
	@Autowired
	BancoService bancoService;
	
	// Devuelve un banco por id
	
		@GetMapping(path = "/{idBanco}", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<BancoDto> getBanco(@PathVariable Long idBanco) {
			
			BancoDto banco = bancoService.getBanco(idBanco);
			
			if (banco != null) {
				return ResponseEntity.status(HttpStatus.OK).body(banco);
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			
		}
		
	// Devuelve la lista de bancos
		
		@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<NewBancoDto>> findBancos(){
						
			
			List<NewBancoDto> bancosDto = bancoService.findBancos();
			
			if (bancosDto.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
			return ResponseEntity.status(HttpStatus.OK).body(bancosDto);
			
		}

}
