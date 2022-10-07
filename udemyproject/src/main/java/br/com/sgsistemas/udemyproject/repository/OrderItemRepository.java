package br.com.sgsistemas.udemyproject.repository;


import br.com.sgsistemas.udemyproject.model.OrderItem;
import br.com.sgsistemas.udemyproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
