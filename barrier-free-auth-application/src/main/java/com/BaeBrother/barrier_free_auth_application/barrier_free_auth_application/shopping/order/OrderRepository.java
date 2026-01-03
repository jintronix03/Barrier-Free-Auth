package com.BaeBrother.barrier_free_auth_application.barrier_free_auth_application.shopping.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
