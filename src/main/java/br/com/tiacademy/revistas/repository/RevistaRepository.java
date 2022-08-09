package br.com.tiacademy.revistas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.tiacademy.revistas.domain.Revista;
import br.com.tiacademy.revistas.core.crud.CrudRepository;

@Repository
public interface RevistaRepository extends CrudRepository<Revista, Long> {
	//query hql
	@Query(value = "select r from Revista r where r.nome = :nome")
	Revista consultarPeloNome(@Param("nome") String nome);
	
	//query spring data
	Revista findByNome(String nome);
	
	//query nativa
	@Query(value = "select r from Revista r where r.id = 2", nativeQuery = true)
	Revista consultarPeloId();
}