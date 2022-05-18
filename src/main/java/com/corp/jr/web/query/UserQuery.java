package com.corp.jr.web.query;


import com.corp.jr.annotation.Query;
import com.corp.jr.util.Tool;
import com.corp.jr.util.enums.CoreDictType;
import com.corp.jr.util.page.MfsyPagination;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

public class UserQuery extends PageParam{

	@Query(name="账号",display=true,fuzzy=true)
	private String code ;
	@Query(name="名称",display=true,fuzzy=true)
	private String name ;
	@Query(name="部门",display=true,type=Query.TYPE_CONTROL,control="org")
	private Long orgId;
	
	@Query(name="状态",display=true,type=Query.TYPE_DICT,dict= CoreDictType.USER_STATE)
	private String state;
	
	@Query(name="职务",display=true,type=Query.TYPE_DICT,dict="job_type0",group="job_type")
	private String jobType0;
	
	@Query(name="职务明细",display=true,type=Query.TYPE_DICT,dict="job_type1",group="job_type")
    private String jobType1;
	
	
	@Query(name="创建日期",display=true,type=Query.TYPE_DATE_BETWEEN)
	private String createDateRange;
	private Date createDateMin;
	private Date createDateMax;


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
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	public String getJobType0() {
        return jobType0;
    }
    public void setJobType0(String jobType0) {
        this.jobType0 = jobType0;
    }
    public String getJobType1() {
        return jobType1;
    }
    public void setJobType1(String jobType1) {
        this.jobType1 = jobType1;
    }
    public String getCreateDateRange() {
		return createDateRange;
	}
	public void setCreateDateRange(String createDateRange) {
		this.createDateRange = createDateRange;
		if(StringUtils.isEmpty(createDateRange)) {
			return ;
		}
		Date[] ds = Tool.parseDataRange(createDateRange);
		this.createDateMin=ds[0];
		this.createDateMax =ds[1];
	}
	public Date getCreateDateMin() {
		return createDateMin;
	}
	public void setCreateDateMin(Date createDateMin) {
		this.createDateMin = createDateMin;
	}
	public Date getCreateDateMax() {
		return createDateMax;
	}
	public void setCreateDateMax(Date createDateMax) {
		this.createDateMax = createDateMax;
	}
//    public String getJobSubType() {
//        return jobSubType;
//    }
//    public void setJobSubType(String jobSubType) {
//        this.jobSubType = jobSubType;
//    }
//   



}
