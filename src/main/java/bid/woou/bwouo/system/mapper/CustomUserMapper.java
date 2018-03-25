package bid.woou.bwouo.system.mapper;


import bid.woou.bwouo.system.domain.CustomUser;

import java.util.List;

/**
 * @Author: zwoou
 * @Date: 2018/3/24
 */

public interface CustomUserMapper {
    CustomUser findByUserName(String username);
    List<CustomUser> findUser();
}
