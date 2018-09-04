package com.docker.consume.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getCountFallBack")
    public String getCount(String cinameCode){
        System.out.println("请求进入");
        return restTemplate.getForObject("http://micro-business-impl/wzf?cinameCode="+cinameCode,String.class);
    }

    public String getCountFallBack(String cinameCode){
        return "cinameCode="+cinameCode+",调用错误";
    }

}
