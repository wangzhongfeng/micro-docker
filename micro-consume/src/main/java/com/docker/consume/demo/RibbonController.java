package com.docker.consume.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
   @Autowired
   private RibbonService ribbonService;

    @RequestMapping("/allcount")
    String getCountByAll(@RequestParam(value = "cinameCode") String cinameCode){
        return ribbonService.getCount(cinameCode);
    }
}
