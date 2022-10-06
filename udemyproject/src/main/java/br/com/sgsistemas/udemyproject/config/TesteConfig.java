package br.com.sgsistemas.udemyproject.config;


import br.com.sgsistemas.udemyproject.model.Category;
import br.com.sgsistemas.udemyproject.model.Order;
import br.com.sgsistemas.udemyproject.model.User;
import br.com.sgsistemas.udemyproject.model.enums.OrderStatus;
import br.com.sgsistemas.udemyproject.repository.CategoryRepository;
import br.com.sgsistemas.udemyproject.repository.OrderRepository;
import br.com.sgsistemas.udemyproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

//        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
//        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");


//        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), userRepository.findById(1L).get(), OrderStatus.PAID);
//        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), userRepository.findById(2L).get(),OrderStatus.WAITING_PAYMENT);
//        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), userRepository.findById(1L).get(),OrderStatus.CANCELED);


//        Category cat1 = new Category(null, "Electronics");
//        Category cat2 = new Category(null, "Books");
//        Category cat3 = new Category(null, "Computers");

//        userRepository.saveAll(Arrays.asList(u1,u2));
//        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
//        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

    }
}
