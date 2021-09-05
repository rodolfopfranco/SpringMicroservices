package com.dio.shoppingcart.demo.repository;

import com.dio.shoppingcart.demo.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
