package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    private String name;

    private String service;

    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {
        System.out.println(getClass() + " : DOING MY DB WORK : ADDING AN ACCOUNT ");
    }

    @Override
    public void addWork() {
        System.out.println(getClass() + " : DOING MY ADDITIONAL WORK");
    }

    public String getName() {
        System.out.println("Account : getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("Account : setName");
        this.name = name;
    }

    public String getService() {
        System.out.println("Account : getService");
        return service;
    }

    public void setService(String service) {
        System.out.println("Account : setService");
        this.service = service;
    }
}
