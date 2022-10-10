package br.com.sgsistemas.udemyproject.controller;


import br.com.sgsistemas.udemyproject.model.Order;
import br.com.sgsistemas.udemyproject.model.OrderItem;
import br.com.sgsistemas.udemyproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        return ResponseEntity.ok().body(orderService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(orderService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Order> insert (@RequestBody Order order){
       Order order1 =  orderService.insert(order);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(order1.getId()).toUri();
        return ResponseEntity.created(uri).body(order1);
    }

    @PutMapping("{id}")
    public ResponseEntity<Order> update (@RequestBody Order order, @PathVariable Long id){
        Order order1 =  orderService.update(order,id);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        orderService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
