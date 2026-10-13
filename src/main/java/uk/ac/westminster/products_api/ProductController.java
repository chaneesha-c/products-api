package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // 1. GET /products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // 2. GET /products/{id}
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    // 3. POST /products
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // 4. DELETE /products/{id}
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    // 5. GET /products/search?name=Laptop
    @GetMapping("/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}