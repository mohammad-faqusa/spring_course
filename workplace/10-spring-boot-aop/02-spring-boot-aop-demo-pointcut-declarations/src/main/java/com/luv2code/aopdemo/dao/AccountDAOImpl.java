package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Account> findAccounts() {
        List<Account> accounts = new ArrayList<>();

        // create sample accounts
        Account temp1 = new Account("mohammad", "m@gmail.com");
        Account temp2 = new Account("ahmad", "a@gmail.com");
        Account temp3 = new Account("sami", "s@gmail.com");

        // add to list accounts :
        accounts.add(temp1);
        accounts.add(temp2);
        accounts.add(temp3);

        // return the accounts
        return accounts;
    }
}
