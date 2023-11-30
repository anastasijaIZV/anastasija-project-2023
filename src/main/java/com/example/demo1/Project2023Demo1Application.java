package com.example.demo1;

import com.lp.domain.model.Customer;
import com.lp.domain.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.lp.domain")
@EnableJpaRepositories(basePackages = "com.lp.domain")
@ComponentScan(basePackages = {
        "com.lp.domain"
})
public class Project2023Demo1Application implements CommandLineRunner {
    private final CustomerService customerService;

    public Project2023Demo1Application(CustomerService customerService) {
        this.customerService = customerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Project2023Demo1Application.class, args);
    }

    public void run(String... args) {
            for (int i = 0; i < 10; i++) {
                Customer c = new Customer();
                c.setName("Customer " + i);
                c.setAffiliate(
                        customerService.getOwner()
                );
                customerService.saveCustomer(c);
            }
            customerService.getAllCustomers().forEach(System.out::println);

    }
}
