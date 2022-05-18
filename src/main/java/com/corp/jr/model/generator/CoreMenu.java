package com.corp.jr.model.generator;

import java.io.Serializable;
import java.util.Date;

/**
 * core_menu
 * @author 
 */
public class CoreMenu implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private Date createTime;

    private Integer functionId;

    /**
     * 1,系统，2 导航 3 菜单项（对应某个功能点）
     */
    private String type;

    private Integer parentMenuId;

    private Integer seq;

    /**
     * 图标
     */
    private String icon;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
        CoreMenu other = (CoreMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFunctionId() == null ? other.getFunctionId() == null : this.getFunctionId().equals(other.getFunctionId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getParentMenuId() == null ? other.getParentMenuId() == null : this.getParentMenuId().equals(other.getParentMenuId()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFunctionId() == null) ? 0 : getFunctionId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getParentMenuId() == null) ? 0 : getParentMenuId().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", functionId=").append(functionId);
        sb.append(", type=").append(type);
        sb.append(", parentMenuId=").append(parentMenuId);
        sb.append(", seq=").append(seq);
        sb.append(", icon=").append(icon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}