package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class SingletonScopeService extends BaseScopeService {

    private static int instanceCounter;

    private int instanceId;

    public SingletonScopeService() {
        instanceId = ++instanceCounter;
    }

    @Override
    public int getInstanceId() {
        return instanceId;
    }
}
