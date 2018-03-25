package bid.woou.bwouo.system.service.impl;


import bid.woou.bwouo.common.domain.User;
import bid.woou.bwouo.common.domain.UserExample;
import bid.woou.bwouo.common.mapper.UserMapper;
import bid.woou.bwouo.system.domain.CustomUser;
import bid.woou.bwouo.system.mapper.CustomUserMapper;
import bid.woou.bwouo.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by cc on 2018/1/6.
 */
@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CustomUserMapper customUserMapper;

    @Override
    public List<User> listUser() {
        UserExample userExample = new UserExample();
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public CustomUser getUser() {
        CustomUser admin = customUserMapper.findByUserName("admin");
        return admin;

    }

}
