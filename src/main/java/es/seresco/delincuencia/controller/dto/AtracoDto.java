package es.seresco.delincuencia.controller.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AtracoDto {

	public AtracoDto(long l, LocalDate fecha2, TipoCondena tipoCondena2, long m) {
		// TODO Auto-generated constructor stub
	}
	@NotNull
	private Long id;
	private LocalDate fecha;
	private TipoCondena tipocondena;
	private Long idSucursal;
	
		
}
