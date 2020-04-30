package cn.hp.test;

import cn.hp.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Set;

public class JedisTest {

    @Test
    public void test(){
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("username","zhangsan");

        String username = jedis.get("username");
        System.out.println(username);

        jedis.setex("activecode",20,"hehe");

        jedis.close();
    }

    @Test
    public void test2(){
        Jedis jedis = new Jedis();

        jedis.lpush("mylist","a","b","c");
        jedis.rpush("mylist","a","b","c");

        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);

        String element1 = jedis.lpop("mylist");
        System.out.println(element1);

        String element2 = jedis.rpop("mylist");
        System.out.println(element2);

        jedis.close();

    }

    @Test
    public void test3(){
        Jedis jedis = new Jedis();

        jedis.sadd("myset","java","php");

        Set<String> myset = jedis.smembers("myset");

        System.out.println(myset);

        jedis.zadd("mysortedset",3,"鸭舌");
        jedis.zadd("mysortedset",2,"鸭脖");
        jedis.zadd("mysortedset",1,"丫头");

        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);
    }


    @Test
    public void test4(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        //1.创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config,"localhost",6379);

        Jedis jedis = jedisPool.getResource();

        jedis.set("haha","heihei");

        jedis.close();
    }


    @Test
    public void test5(){
        Jedis jedis = JedisPoolUtils.getJedis();

        jedis.set("hello","world");

        jedis.close();
    }
}
