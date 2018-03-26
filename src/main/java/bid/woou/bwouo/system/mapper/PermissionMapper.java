package bid.woou.bwouo.system.mapper;

import bid.woou.bwouo.system.domain.Permission;

import java.util.List;

/**
 * @Author: zwoou
 * @Date: 2018/3/26
 */
public interface PermissionMapper {
    List<Permission> findAll();
    List<Permission> findByAdminUserId(int userId);
}
