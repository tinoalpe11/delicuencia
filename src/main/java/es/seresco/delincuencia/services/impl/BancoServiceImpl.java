package es.seresco.delincuencia.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.seresco.delincuencia.controller.dto.BancoDto;
import es.seresco.delincuencia.controller.dto.NewBancoDto;
import es.seresco.delincuencia.model.Banco;
import es.seresco.delincuencia.repository.BancoRepository;
import es.seresco.delincuencia.services.BancoService;

@Service
public class BancoServiceImpl implements BancoService {
	
	@Autowired
	private BancoRepository bancoRepository;
	
	
	
	
	
	public List<NewBancoDto> findBancos() {
		NewBancoDto bancoDto = new NewBancoDto();
		List<NewBancoDto> bancosDto = new ArrayList<>();
		List<Banco> bancos = bancoRepository.findBancos();
		
		
		if(bancos.isEmpty() ) {
			return null;
		}
		
		
		for (Banco b : bancos) {
			
			//bancoDto.setId(b.getId());
			bancoDto.setCodigo(b.getCodigo());
			bancoDto.setSede(b.getSede());
			System.out.println(bancoDto.getCodigo());
			bancosDto.add(bancoDto);
			
	}
		return bancosDto;
	}



	@Override
	public BancoDto getBanco(Long idBanco) {
		BancoDto bancoDto = new BancoDto();
		Banco banco = bancoRepository.getById(idBanco);
		
		
		if (banco != null) {
			bancoDto.setId(banco.getId());
			bancoDto.setCodigo(banco.getCodigo());
			bancoDto.setSede(banco.getSede());
			
		}
		return bancoDto;
		
	
	}

/*

	@Override
	public List<BancoDto> findBancos() {
		
	
		return bancoRepository.findBancos();
		
	}


	@Override
	public BancoDto createBanco(NewBancoDto newBancoDto) {
		
		return bancoRepository.createBanco(newBancoDto);
	}



	@Override
	public void deleteBanco(Long idBanco) {
		
		bancoRepository.deleteBanco(idBanco);
	}
	
*/
}
