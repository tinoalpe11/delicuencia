package es.seresco.delincuencia.controller.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewAtracoDto {

	//@NotBlank
	@Past
	private LocalDate fecha;
	
	//@NotEmpty
	private TipoCondena tipocondena;
	
	//@NotNull
	@Positive
	private Long idSucursal;
	
}
