package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    void addWork();

    public String getName();

    public void setName(String name);

    public String getService();

    public void setService(String service);
}
