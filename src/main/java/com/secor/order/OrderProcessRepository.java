package com.secor.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderProcessRepository extends JpaRepository<OrderProcess, Long> {
    List<OrderProcess> findByOrdernameContaining(String ordername);
}
