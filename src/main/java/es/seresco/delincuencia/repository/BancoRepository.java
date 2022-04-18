package es.seresco.delincuencia.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.seresco.delincuencia.model.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long>{
	
	@Query("select b from Banco b")
	List<Banco> findBancos();
	
	

}