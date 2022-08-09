package br.com.tiacademy.revistas.repository;

import org.springframework.stereotype.Repository;

import br.com.tiacademy.revistas.core.crud.CrudRepository;
import br.com.tiacademy.revistas.domain.Editora;

@Repository
public interface EditoraRepository extends CrudRepository<Editora, Long> {

}
