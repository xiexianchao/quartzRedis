package com.xiechao.job;

import com.xiechao.util.SpringContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

public class RedisJob {
    private static final Logger logger = LoggerFactory.getLogger(RedisJob.class);

    @Resource(name="redisTemplate",type=RedisTemplate.class)
    private RedisTemplate redisTemplate;


    public void execute(){
        if(redisTemplate == null){
            redisTemplate = (RedisTemplate) SpringContextUtil.getBean("redisTemplate");
        }
        String name =(String) redisTemplate.opsForValue().get("name");
        logger.info("从redis中获得:name = " + name );
//        redisTemplate.opsForValue().set("name","xiechao");
//        logger.info("set redis key-name:xiechao");

    }

}
