package com.haishili.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipDao {

    private static final Logger logger = LoggerFactory.getLogger(VipDao.class);

    public void insert() {
        logger.info("正在保存 VIP 信息");
    }
}
