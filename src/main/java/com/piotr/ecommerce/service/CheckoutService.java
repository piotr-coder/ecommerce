package com.piotr.ecommerce.service;

import com.piotr.ecommerce.dto.Purchase;
import com.piotr.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
