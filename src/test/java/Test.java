import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-redis.xml")
public class Test {

    @Resource(name="redisTemplate")
    private RedisTemplate redisTemplate;

    @org.junit.Test
    public void test(){

           System.out.println(redisTemplate == null);

    }

}
