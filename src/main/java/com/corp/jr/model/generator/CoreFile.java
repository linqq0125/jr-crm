package com.corp.jr.model.generator;

import java.io.Serializable;
import java.util.Date;

/**
 * core_file
 * @author 
 */
public class CoreFile implements Serializable {
    private Integer id;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 路径
     */
    private String path;

    /**
     * 业务ID
     */
    private String bizId;

    /**
     * 上传人id
     */
    private Integer userId;

    /**
     * 创建时间
     */
    private Date createTime;

    private Integer orgId;

    private String bizType;

    private String fileBatchId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getFileBatchId() {
        return fileBatchId;
    }

    public void setFileBatchId(String fileBatchId) {
        this.fileBatchId = fileBatchId;
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
        CoreFile other = (CoreFile) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getBizId() == null ? other.getBizId() == null : this.getBizId().equals(other.getBizId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getFileBatchId() == null ? other.getFileBatchId() == null : this.getFileBatchId().equals(other.getFileBatchId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getBizId() == null) ? 0 : getBizId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getFileBatchId() == null) ? 0 : getFileBatchId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", bizId=").append(bizId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", orgId=").append(orgId);
        sb.append(", bizType=").append(bizType);
        sb.append(", fileBatchId=").append(fileBatchId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}