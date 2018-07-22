package com.google.service.impl;

import com.google.dao.CustomerDao;
import com.google.domain.Customer;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer findOne(String custId) {

        return customerDao.findOne(custId);
    }
}
