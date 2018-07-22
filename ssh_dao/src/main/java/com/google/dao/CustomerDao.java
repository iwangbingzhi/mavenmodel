package com.google.dao;

import com.google.domain.Customer;

public interface CustomerDao {
    Customer findOne(String custId);
}
