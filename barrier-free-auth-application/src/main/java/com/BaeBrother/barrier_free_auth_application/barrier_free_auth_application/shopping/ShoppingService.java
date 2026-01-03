package com.BaeBrother.barrier_free_auth_application.barrier_free_auth_application.shopping;

import com.BaeBrother.barrier_free_auth_application.barrier_free_auth_application.shopping.order.OrderService;
import com.BaeBrother.barrier_free_auth_application.barrier_free_auth_application.shopping.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    // product Id -> product DTO -> return JASON
    public String getProductByProductIdToJason(long productId) {
    }

    // user Id -> List of product DTO
    public String getProductByUserIdToJason(long userId) {
    }

    // order Id -> order DTO -> return JASON
    public String getOrderByOrderIdToJason(long orderId) {
    }

    // user Id -> List of product DTO
    public String getOrderByUserIdToJason(long userId) {
    }
}
