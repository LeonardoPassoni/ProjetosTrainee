package br.com.sgsistemas.udemyproject.service;


import br.com.sgsistemas.udemyproject.model.Product;
import br.com.sgsistemas.udemyproject.repository.CategoryRepository;
import br.com.sgsistemas.udemyproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }


    public Product insert(Product product) {
       return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public Product update(Long id, Product product) {
        Product entity = productRepository.getReferenceById(id);
        updateData(entity,product);
        return productRepository.save(entity);

    }

    private void updateData(Product entity, Product product) {
        entity.setName(product.getName());
        entity.setDescription(product.getDescription());
        entity.setPrice(product.getPrice());
        entity.setImgUrl(product.getImgUrl());
    }
}
