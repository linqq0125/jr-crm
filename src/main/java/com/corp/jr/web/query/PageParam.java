package com.corp.jr.web.query;

/**
 * 子类继承此类获得翻页功能
 * @author xiajr
 */
public class PageParam {
    private Integer page = null;//页码
    private Integer limit = null;//每页数据条数
    private Integer pageSize=0;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }


	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
