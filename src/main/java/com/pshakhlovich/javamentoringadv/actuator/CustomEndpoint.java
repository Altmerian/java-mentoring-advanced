package com.pshakhlovich.javamentoringadv.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "custom")
@Component
public class CustomEndpoint {

    @ReadOperation
    public Map<String, String> customEndpoint(@Nullable String id) {
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        return map;
    }
}
