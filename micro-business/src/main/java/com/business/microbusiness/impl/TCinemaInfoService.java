package com.business.microbusiness.impl;

import com.business.microbusiness.ITCinemaInfoService;
import com.business.microbusiness.dao.TCinemaInfoDao;
import com.business.microbusiness.entity.TCinemaInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TCinemaInfoService  implements ITCinemaInfoService{
    @Autowired
    private TCinemaInfoDao tCinemaInfoDao;

    @Override
    @GetMapping("/wzf")
    public int getCinemaInfoByCinameCode(String cinameCode) {
        return tCinemaInfoDao.queryByCinemaCode(cinameCode).getId();
    }
}
