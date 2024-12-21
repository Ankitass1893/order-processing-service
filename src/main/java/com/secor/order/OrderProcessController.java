package com.secor.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/orders")
public class OrderProcessController {
    private final OrderProcessService productService;

    public OrderProcessController(OrderProcessService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<OrderProcess> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public OrderProcess getProductById(@PathVariable Long id) throws ResourceNotFoundException {
        return productService.getProductById(id);
    }

    @PostMapping
    public ResponseEntity<OrderProcess> createProduct(@RequestBody OrderProcess product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
