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

    @Transactional
    public void Teste(){
        Product product = productRepository.findById(5L).get();
        product.getCategories().add(categoryRepository.findById(3L).get());
        productRepository.save(product);
    }
}
