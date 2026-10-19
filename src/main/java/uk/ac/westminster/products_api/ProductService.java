package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

      public ProductService(){
          addProduct(new DigitalProduct(null, "ebook", 20.20, "https://download.com/ebook.pdf"));
          addProduct(new PhysicalProduct(null,"wireless mouse", 30.20, 0.25));
      }
    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id)) // Always use .equals() for Long objects
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList(); // If on Java 11-15, use .collect(java.util.stream.Collectors.toList())
    }
}