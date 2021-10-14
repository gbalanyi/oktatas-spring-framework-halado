package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public abstract class BaseUseScopeService {

    protected abstract BaseScopeService getScopeService();

    public void printScopeServiceInstance() {
        System.out.println(String.format("I'm %s and my scope service type: %s and instance id: %d",
                this.getClass().getSimpleName(),
                this.getScopeService().getClass().getSimpleName(),
                this.getScopeService().getInstanceId()));
    }
}
