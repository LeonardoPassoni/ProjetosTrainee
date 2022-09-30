package br.com.sgsistemas.spring.data.repository;

import br.com.sgsistemas.spring.data.model.Unidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends CrudRepository<Unidade,Integer> {

}
