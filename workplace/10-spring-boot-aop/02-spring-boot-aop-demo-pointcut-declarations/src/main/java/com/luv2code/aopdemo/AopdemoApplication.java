package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

    private AccountDAO accountDAO;
    private MembershipDAO membershipDAO;

    public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO) {

        return runner -> {
            demoTheBeforeAdvice(accountDAO, membershipDAO);
        };
    }

    private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {

        Account theAccount = new Account();

        accountDAO.addAccount(theAccount, true);
        accountDAO.addWork();

        // getters and setters

        accountDAO.setName("Mohammad");
        accountDAO.setService("Programming");
        accountDAO.getName();
        accountDAO.getService();

        membershipDAO.addSilly();
        membershipDAO.goToSleep();

    }

}
