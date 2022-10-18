package br.com.sgsistemas.udemyproject.controller;


import br.com.sgsistemas.udemyproject.model.Product;
import br.com.sgsistemas.udemyproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok().body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(productService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Product> insert (@RequestBody Product product){
        product = productService.insert(product);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).body(product);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> update (@PathVariable Long id , @RequestBody Product product){
        Product product1 = productService.update(id,product);
        return ResponseEntity.ok(product1);

    }
}
