package com.google.service.impl;

import com.google.dao.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")

public class CustomerServiceTest {


    @Autowired
    private CustomerService customerService;
    @Test
    public void findOne() {
        customerService.findOne("1");
    }
}