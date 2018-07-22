package com.google.action;

import com.google.domain.Customer;
import com.google.service.impl.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//1111111
public class CustomerAction extends ActionSupport {
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    private String custId;
    //根据主键查询
    public String findOne() throws Exception{
        Customer customer = customerService.findOne(custId);
        ActionContext.getContext().getValueStack().push(customer);
        return SUCCESS;
    }
}
