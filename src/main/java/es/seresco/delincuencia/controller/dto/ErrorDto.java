package es.seresco.delincuencia.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDto {

	String fecha;
	String codigoError;
	String mensaje;
}
