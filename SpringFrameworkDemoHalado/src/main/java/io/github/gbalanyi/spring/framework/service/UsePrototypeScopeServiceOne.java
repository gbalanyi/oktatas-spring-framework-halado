package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class UsePrototypeScopeServiceOne extends BaseUseScopeService {

    private final PrototypeScopeService prototypeScopeService;

    public UsePrototypeScopeServiceOne(PrototypeScopeService prototypeScopeService) {
        this.prototypeScopeService = prototypeScopeService;
    }

    @Override
    protected BaseScopeService getScopeService() {
        return prototypeScopeService;
    }
}
