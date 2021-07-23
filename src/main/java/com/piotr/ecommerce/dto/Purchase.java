package com.piotr.ecommerce.dto;

import com.piotr.ecommerce.entity.Address;
import com.piotr.ecommerce.entity.Customer;
import com.piotr.ecommerce.entity.Order;
import com.piotr.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
