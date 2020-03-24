package de.nsasse.microadvisor.portfolio.controller;

import de.nsasse.microadvisor.portfolio.model.Product;
import de.nsasse.microadvisor.portfolio.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.ManagedBean;
import java.util.List;

@ManagedBean
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/all")
    public List<Product> getProducts() {
        System.out.println("Get request /product/all");
        return productService.findAll();
    }
}
