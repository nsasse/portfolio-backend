package de.nsasse.microadvisor.portfolio;

import de.nsasse.microadvisor.database.ConnectionTest;
import de.nsasse.microadvisor.portfolio.dao.impl.ProductDao;
import de.nsasse.microadvisor.portfolio.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.ManagedBean;
import java.util.List;

@SpringBootApplication
@ManagedBean
public class PortfolioMicroservice {
    public static void main(String[] args) {
        SpringApplication.run(PortfolioMicroservice.class, args);
        ConnectionTest connect = new ConnectionTest();
        connect.connectToSqlServer();

        ProductDao productDao = new ProductDao();
        List<Product> productDaoList = productDao.findAll();
        productDaoList
                .stream()
                .forEach(product -> {
                    System.out.println(product.getName());
                    //System.out.println(product.getRegion());
                    //System.out.println(product.getProductType());
                });
    }
}
