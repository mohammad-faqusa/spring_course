package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public boolean addSilly() {
        System.out.println(getClass() + " : DOING MY DB WORK : ADDING AN ACCOUNT IN MEMBERSHIP  ");

        return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + " : LETS GO TO SLEEP ");
    }


}
