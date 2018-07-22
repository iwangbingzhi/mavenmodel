package com.google.service.impl;

import com.google.domain.Customer;

public interface CustomerService {
    Customer findOne(String custId);
}
