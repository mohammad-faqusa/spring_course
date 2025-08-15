package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.services.TrafficFortuneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopdemoApplication {

    private AccountDAO accountDAO;
    private MembershipDAO membershipDAO;

    public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(
            AccountDAO accountDAO,
            MembershipDAO membershipDAO,
            TrafficFortuneService theTrafficFortuneService) {

        return runner -> {
//            demoTheBeforeAdvice(accountDAO, membershipDAO);
//            demoTheAfterReturningAdvice(accountDAO);
//            demoTheAfterThrowingAdvice(accountDAO);

//            demoTheAfterAdvice(accountDAO);
//            demoTheAroundAdvice(theTrafficFortuneService);
//            demoTheAroundAdviceHandleException(theTrafficFortuneService);
            demoThearoundAdviceRethrowException(theTrafficFortuneService);
        };

    }

    private void demoThearoundAdviceRethrowException(TrafficFortuneService theTrafficFortuneService) {

        System.out.println("\nMain Program: demoTheAroundAdviceHandleException ");

        System.out.println("\nCalling getFortune()");

        boolean tripWire = true;
        String data =  theTrafficFortuneService.getFortune(tripWire);

        System.out.println("\nMy fortune is : " + data);

        System.out.println("Finished");
    }

    private void demoTheAroundAdviceHandleException(TrafficFortuneService theTrafficFortuneService) {

        System.out.println("\nMain Program: demoTheAroundAdviceHandleException ");

        System.out.println("\nCalling getFortune()");

        boolean tripWire = true;
        String data =  theTrafficFortuneService.getFortune(tripWire);

        System.out.println("\nMy fortune is : " + data);

        System.out.println("Finished");
    }

    private void demoTheAroundAdvice(TrafficFortuneService theTrafficFortuneService) {

        System.out.println("\nMain Program: demoTheAroundAdvice ");

        System.out.println("\nCalling getFortune()");

        String data =  theTrafficFortuneService.getFortune();

        System.out.println("\nMy fortune is : " + data);

        System.out.println("Finished");
    }

    private void demoTheAfterAdvice(AccountDAO accountDAO) {

        // call the findAccounts
        List<Account> theAccounts = null;

        try{
            theAccounts = accountDAO.findAccounts(false);
            System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
        } catch (Exception e){
            System.out.println("Main Program: demoTheAfterThrowingAdvice - Exception: " + e.getMessage());
        }

        // display the accounts
        System.out.println("-------------");

        System.out.println(theAccounts);

        System.out.println("\n");
    }

    private void demoTheAfterThrowingAdvice(AccountDAO accountDAO) {

        // call the findAccounts
        List<Account> theAccounts = null;

        try{
            theAccounts = accountDAO.findAccounts(false);
            System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
        } catch (Exception e){
            System.out.println("Main Program: demoTheAfterThrowingAdvice - Exception: " + e.getMessage());
        }

        // display the accounts
        System.out.println("-------------");

        System.out.println(theAccounts);

        System.out.println("\n");

    }

    private void demoTheAfterReturningAdvice(AccountDAO accountDAO) {

        // call the findAccounts
        List<Account> theAccounts = accountDAO.findAccounts();

        // display the accounts
        System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
        System.out.println("-------------");

        System.out.println(theAccounts);

        System.out.println("\n");
    }

    private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {

        Account theAccount = new Account();
        theAccount.setName("John Doe");
        theAccount.setEmail("john@gmail.com");

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
