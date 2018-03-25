package bid.woou.bwouo.system.controller;


import bid.woou.bwouo.common.domain.User;
import bid.woou.bwouo.system.domain.CustomUser;
import bid.woou.bwouo.system.mapper.CustomUserMapper;
import bid.woou.bwouo.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zwoou
 * @Date: 2018/3/24
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CustomUserMapper customUserMapper;
    @RequestMapping("/userList")
    public List<User>  listUser(){
        return userService.listUser();
    }
    @RequestMapping("/user")
    public CustomUser getCustomUser(){
        return userService.getUser();
    }

}
