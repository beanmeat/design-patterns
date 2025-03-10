package com.meat.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

public class MyBatis{

    // 缓存User
    private Map<String,User> userCache = new HashMap<>();

    /**
     * 从数据库中查数据
     */
    public User getUser(String username) throws Exception {
        User user = null;
        // 缓存中没有
        if(!userCache.containsKey(username)){
            user = getUserFromDb(username);
            userCache.put(username, (User) user.clone());
        }else{
            // 从缓存中直接拿，脏缓存问题
            // 原型已经拿到，但是不能直接给;
            user = userCache.get(username);
            // 从这个对象快速得到一个克隆体
            user = (User) user.clone();

        }
        return user;
    }

    private static User getUserFromDb(String username) throws Exception{
        System.out.println("从数据库查：" + username);
        User user = new User();
        user.setUsername(username);
        user.setAge(18);
        return user;
    }
}
