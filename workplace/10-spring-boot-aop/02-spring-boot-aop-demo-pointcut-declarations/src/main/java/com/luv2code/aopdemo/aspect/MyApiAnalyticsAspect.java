package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyApiAnalyticsAspect {

    @Before("LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeApiAnalytics() {
        System.out.println("====>>> Execution Api Analytics ");
    }
}
