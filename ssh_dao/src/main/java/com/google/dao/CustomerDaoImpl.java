package com.google.dao;

import com.google.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public Customer findOne(String custId) {
        return this.getHibernateTemplate().get(Customer.class,custId);
    }
}
