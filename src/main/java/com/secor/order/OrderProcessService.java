package com.secor.order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProcessService {
    private final OrderProcessRepository OrderProcessRepository;

    public OrderProcessService(OrderProcessRepository OrderProcessRepository) {
        this.OrderProcessRepository = OrderProcessRepository;
    }

    public List<OrderProcess> getAllProducts() {
        return (List<OrderProcess>) OrderProcessRepository.findAll();
    }

    public OrderProcess getProductById(Long id) throws ResourceNotFoundException {
        return OrderProcessRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    public OrderProcess createProduct(OrderProcess product) {
        return OrderProcessRepository.save(product);
    }

    public void deleteProduct(Long id) {
        OrderProcessRepository.deleteById(id);
    }
}
