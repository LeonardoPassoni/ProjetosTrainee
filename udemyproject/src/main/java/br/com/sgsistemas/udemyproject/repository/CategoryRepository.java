package br.com.sgsistemas.udemyproject.repository;

import br.com.sgsistemas.udemyproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
