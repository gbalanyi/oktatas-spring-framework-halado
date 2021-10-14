package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public abstract class BaseScopeService {

    public abstract int getInstanceId();
}
