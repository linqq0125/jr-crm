package com.corp.jr.model.generator;

import java.io.Serializable;

/**
 * core_role_function
 * @author 
 */
public class CoreRoleFunction implements Serializable {
    private Integer id;

    private Integer roleId;

    private Integer functionId;

    private Byte dataAccessType;

    private String dataAccessPolicy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Byte getDataAccessType() {
        return dataAccessType;
    }

    public void setDataAccessType(Byte dataAccessType) {
        this.dataAccessType = dataAccessType;
    }

    public String getDataAccessPolicy() {
        return dataAccessPolicy;
    }

    public void setDataAccessPolicy(String dataAccessPolicy) {
        this.dataAccessPolicy = dataAccessPolicy;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CoreRoleFunction other = (CoreRoleFunction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getFunctionId() == null ? other.getFunctionId() == null : this.getFunctionId().equals(other.getFunctionId()))
            && (this.getDataAccessType() == null ? other.getDataAccessType() == null : this.getDataAccessType().equals(other.getDataAccessType()))
            && (this.getDataAccessPolicy() == null ? other.getDataAccessPolicy() == null : this.getDataAccessPolicy().equals(other.getDataAccessPolicy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getFunctionId() == null) ? 0 : getFunctionId().hashCode());
        result = prime * result + ((getDataAccessType() == null) ? 0 : getDataAccessType().hashCode());
        result = prime * result + ((getDataAccessPolicy() == null) ? 0 : getDataAccessPolicy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", functionId=").append(functionId);
        sb.append(", dataAccessType=").append(dataAccessType);
        sb.append(", dataAccessPolicy=").append(dataAccessPolicy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}