package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class UseSingletonScopeServiceOne extends BaseUseScopeService {

    private final SingletonScopeService singletonScopeService;

    public UseSingletonScopeServiceOne(SingletonScopeService singletonScopeService) {
        this.singletonScopeService = singletonScopeService;
    }

    @Override
    protected BaseScopeService getScopeService() {
        return singletonScopeService;
    }
}
