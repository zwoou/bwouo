package bid.woou.bwouo.common.domain;

import java.io.Serializable;

public class SysPermissionRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission_role.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission_role.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission_role.permisson_id
     *
     * @mbggenerated
     */
    private Integer permissonId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission_role.id
     *
     * @return the value of sys_permission_role.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission_role.id
     *
     * @param id the value for sys_permission_role.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission_role.role_id
     *
     * @return the value of sys_permission_role.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission_role.role_id
     *
     * @param roleId the value for sys_permission_role.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission_role.permisson_id
     *
     * @return the value of sys_permission_role.permisson_id
     *
     * @mbggenerated
     */
    public Integer getPermissonId() {
        return permissonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission_role.permisson_id
     *
     * @param permissonId the value for sys_permission_role.permisson_id
     *
     * @mbggenerated
     */
    public void setPermissonId(Integer permissonId) {
        this.permissonId = permissonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission_role
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissonId=").append(permissonId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}