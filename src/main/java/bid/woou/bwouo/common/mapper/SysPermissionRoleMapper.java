package bid.woou.bwouo.common.mapper;

import bid.woou.bwouo.common.domain.SysPermissionRole;
import bid.woou.bwouo.common.domain.SysPermissionRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int countByExample(SysPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int deleteByExample(SysPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int insert(SysPermissionRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int insertSelective(SysPermissionRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    List<SysPermissionRole> selectByExample(SysPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    SysPermissionRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysPermissionRole record, @Param("example") SysPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysPermissionRole record, @Param("example") SysPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysPermissionRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysPermissionRole record);
}