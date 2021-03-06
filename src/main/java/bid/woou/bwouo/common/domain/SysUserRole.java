package bid.woou.bwouo.common.domain;

import java.io.Serializable;

public class SysUserRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.user_role_id
     *
     * @mbggenerated
     */
    private Integer userRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.sys_user_id
     *
     * @mbggenerated
     */
    private Integer sysUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.sys_role_id
     *
     * @mbggenerated
     */
    private Integer sysRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.user_role_id
     *
     * @return the value of sys_user_role.user_role_id
     *
     * @mbggenerated
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.user_role_id
     *
     * @param userRoleId the value for sys_user_role.user_role_id
     *
     * @mbggenerated
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.sys_user_id
     *
     * @return the value of sys_user_role.sys_user_id
     *
     * @mbggenerated
     */
    public Integer getSysUserId() {
        return sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.sys_user_id
     *
     * @param sysUserId the value for sys_user_role.sys_user_id
     *
     * @mbggenerated
     */
    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.sys_role_id
     *
     * @return the value of sys_user_role.sys_role_id
     *
     * @mbggenerated
     */
    public Integer getSysRoleId() {
        return sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.sys_role_id
     *
     * @param sysRoleId the value for sys_user_role.sys_role_id
     *
     * @mbggenerated
     */
    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRoleId=").append(userRoleId);
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", sysRoleId=").append(sysRoleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}