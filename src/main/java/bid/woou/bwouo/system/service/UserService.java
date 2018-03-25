package bid.woou.bwouo.system.service;

import bid.woou.bwouo.common.domain.User;
import bid.woou.bwouo.system.domain.CustomUser;

import java.util.List;

/**
 * Created by cc on 2018/1/6.
 */
public interface UserService {
   List<User> listUser();
   CustomUser getUser();
}


