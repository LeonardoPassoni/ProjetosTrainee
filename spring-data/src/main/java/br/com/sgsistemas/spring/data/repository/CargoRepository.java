package br.com.sgsistemas.spring.data.repository;

import br.com.sgsistemas.spring.data.model.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends CrudRepository<Cargo,Integer>{
}
