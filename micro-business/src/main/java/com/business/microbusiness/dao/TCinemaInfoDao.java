package com.business.microbusiness.dao;

import com.business.microbusiness.entity.TCinemaInfoEntity;
public interface TCinemaInfoDao {

    /**
     * 根据cinemaCode查询影院
     * @param cinemaCode
     * @return
     */
    TCinemaInfoEntity queryByCinemaCode(String cinemaCode);
}
