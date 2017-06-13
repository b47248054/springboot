package com.wanye;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by wanye on 2017/6/3.
 */
@Component
public class CacheInit implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CacheInit.class);
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>cache init<<");
        logger.info("cache init");
    }
}
