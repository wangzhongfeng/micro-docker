package com.docker.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;

@Service
public class MyAppHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        if(check()!=0){
            return Health.up().build();
        }
        return Health.down().withDetail("error", "出错了").build();
    }
    private int check(){
        // 检测是否健康的自定义逻辑
        return 0;
    }
}
