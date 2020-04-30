package cn.hp.service.impl;

import cn.hp.dao.Impl.ProvinceDaoImpl;
import cn.hp.dao.ProvinceDao;
import cn.hp.domain.Province;
import cn.hp.service.ProvinceService;
import cn.hp.util.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public String findAllJson() {
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        if (province_json==null||province_json.length()==0){
            System.out.println("redis中无数据");

            List<Province> ps = dao.findAll();
            ObjectMapper mapper = new ObjectMapper();

            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            jedis.set("province",province_json);

        }else{
            System.out.println("redis中有数据");
        }

        return province_json;
    }
}
