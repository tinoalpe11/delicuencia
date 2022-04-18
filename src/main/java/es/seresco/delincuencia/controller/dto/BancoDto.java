package es.seresco.delincuencia.controller.dto;



import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BancoDto {
	
	
	
	@JsonProperty("id")
	@NotNull
	private Long id;
	
	@JsonProperty("codigo")
	@NotNull
	private String codigo;
	
	@JsonProperty("sede")
	@NotNull
	private String sede;
	

}
