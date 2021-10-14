package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class UseSingletonScopeServiceTwo extends BaseUseScopeService {

    private final SingletonScopeService singletonScopeService;

    public UseSingletonScopeServiceTwo(SingletonScopeService singletonScopeService) {
        this.singletonScopeService = singletonScopeService;
    }

    @Override
    protected BaseScopeService getScopeService() {
        return singletonScopeService;
    }
}
