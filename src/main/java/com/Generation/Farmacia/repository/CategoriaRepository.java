package com.Generation.Farmacia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Generation.Farmacia.model.CategoriaModel;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public List<CategoriaModel> findAllByDescricaoContainingIgnoreCase(String descricao);

}
