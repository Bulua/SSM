package cn.edu.aynu.service.impl;

import cn.edu.aynu.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String verificationCode(String name) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        String codeStr = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] codes = codeStr.toCharArray();
        for (int i=0; i<4; i++){
            code.append(codes[random.nextInt(codeStr.length())]);
        }
        valueOperations.set(name,code,60, TimeUnit.SECONDS);
        return code.toString();
    }
}
