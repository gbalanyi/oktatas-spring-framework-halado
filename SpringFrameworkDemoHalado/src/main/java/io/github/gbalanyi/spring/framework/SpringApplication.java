
package io.github.gbalanyi.spring.framework;

import io.github.gbalanyi.spring.framework.config.BaseApplicationConfig;
import io.github.gbalanyi.spring.framework.service.UsePrototypeScopeServiceOne;
import io.github.gbalanyi.spring.framework.service.UsePrototypeScopeServiceTwo;
import io.github.gbalanyi.spring.framework.service.UseSingletonScopeServiceOne;
import io.github.gbalanyi.spring.framework.service.UseSingletonScopeServiceTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BaseApplicationConfig.class);

        UseSingletonScopeServiceOne useSingletonScopeServiceOne = context.getBean(UseSingletonScopeServiceOne.class);
        useSingletonScopeServiceOne.printScopeServiceInstance();

        UseSingletonScopeServiceTwo useSingletonScopeServiceTwo = context.getBean(UseSingletonScopeServiceTwo.class);
        useSingletonScopeServiceTwo.printScopeServiceInstance();

        UsePrototypeScopeServiceOne usePrototypeScopeServiceOne = context.getBean(UsePrototypeScopeServiceOne.class);
        usePrototypeScopeServiceOne.printScopeServiceInstance();

        UsePrototypeScopeServiceTwo usePrototypeScopeServiceTwo = context.getBean(UsePrototypeScopeServiceTwo.class);
        usePrototypeScopeServiceTwo.printScopeServiceInstance();
    }
}
