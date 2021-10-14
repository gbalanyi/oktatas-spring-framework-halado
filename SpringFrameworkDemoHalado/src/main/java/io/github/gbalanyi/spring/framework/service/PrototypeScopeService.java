package io.github.gbalanyi.spring.framework.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeScopeService extends BaseScopeService {

    private static int instanceCounter;

    private int instanceId;

    public PrototypeScopeService() {
        instanceId = ++instanceCounter;
    }

    @Override
    public int getInstanceId() {
        return instanceId;
    }
}
