package br.com.sgsistemas.udemyproject.service;


import br.com.sgsistemas.udemyproject.model.Order;
import br.com.sgsistemas.udemyproject.model.OrderItem;
import br.com.sgsistemas.udemyproject.model.Product;
import br.com.sgsistemas.udemyproject.model.User;
import br.com.sgsistemas.udemyproject.repository.OrderRepository;
import br.com.sgsistemas.udemyproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }

    public Order insert(Order order) {
       return orderRepository.save(order);
    }

    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    public Order update(Order order, Long id) {
        Order entity = orderRepository.getReferenceById(id);
        updateData(entity,order);
        return orderRepository.save(entity);

    }

    private void updateData(Order entity, Order order) {
        entity.setItems(order.getItems());

    }

}
