package com.corp.jr.util.page;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * [简要描述]: List 分页工具
 * [详细描述]:
 *
 * @version 1.0,   09:38
 * @since JDK 1.8
 */
public final class ListPageUtil<T> {
    private CopyOnWriteArrayList<T> list;
    private int pageSize = 6;//每页数 默认6
    private int pageCount = 0;//一共多少页
    private int listSize = 0;//总页数
    private int index = 0;

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public void setIndex(int index) {
        this.index = index-1;
    }

    /**
     * [简要描述]:List分页工具初始化<br/>
     * [详细描述]:<br/>
     *
     * @param list     : 待分页的数据集
     * @param pageSize : 每页数
     * @return
     **/
    public ListPageUtil(List<T> list, int pageSize) {
        this.init(list,pageSize);
    }
    /**
     * [简要描述]:List分页工具初始化<br/>
     * [详细描述]:<br/>
     *
     * @param list     : 待分页的数据集
     * @param  : 每页数 默认6
     * @return
     **/
    public ListPageUtil(List<T> list) {
        this.init(list,pageSize);
    }

    private void init(List<T> list, int pageSize){
        if (null == list || 0 == list.size()) {
            throw new UnsupportedOperationException("List can not null!");
        }

        if (0 == pageSize) {
            throw new UnsupportedOperationException("Page size can not 0");
        }

        this.list = new CopyOnWriteArrayList<>(list);
        this.listSize = list.size();

        if (pageSize > listSize) {
            this.pageSize = listSize;
        } else {
            this.pageSize = pageSize;
        }

        this.pageCount = listSize / pageSize;
        this.pageCount = listSize % pageSize == 0 ? pageCount : pageCount + 1;
        this.index = 0;
    }

    /**
     * [简要描述]:获取首页<br/>
     * [详细描述]:<br/>
     *
     * @return java.util.List<T>
     *     - 10:02
     **/
    public List<T> getFistPage() {
        return list.subList(0, pageSize);
    }

    /**
     * [简要描述]:获取最后一页<br/>
     * [详细描述]:<br/>
     *
     * @return java.util.List<T>
     *     - 10:03
     **/
    public List<T> getLastPage() {
        return list.subList((pageCount - 1) * pageSize, listSize);
    }

    /**
     * [简要描述]:获取下一页<br/>
     * [详细描述]:<br/>
     *
     * @return java.util.List<T>
     *     - 10:03
     **/
    public List<T> nextPage() {
        List<T> subList = null;
        if (index == pageCount - 1) {
            subList = list.subList(index * pageSize, listSize);
        } else {
            subList = list.subList(index * pageSize, (index + 1) * pageSize);
        }
        index++;
        return subList;
    }

    /**
     * [简要描述]:是否有下一页<br/>
     * [详细描述]:<br/>
     *
     * @return boolean
     *     - 10:03
     **/
    public boolean hasNext() {
        return index < pageCount;
    }

    /**
     * [简要描述]:获取总页数<br/>
     * [详细描述]:<br/>
     *
     * @return int
     *     - 10:03
     **/
    public int getPageCount() {
        return pageCount;
    }

    /**
     * [简要描述]:获取每页数<br/>
     * [详细描述]:<br/>
     *
     * @return int
     *     - 10:03
     **/
    public int getPageSize() {
        return pageSize;
    }

    /**
     * [简要描述]:获取当前页数<br/>
     * [详细描述]:<br/>
     *
     * @return int
     *     - 10:03
     **/
    public int getIndex() {
        return index + 1;
    }

    /**
     * [简要描述]:获取带分页的数据总数<br/>
     * [详细描述]:<br/>
     *
     * @return int
     *     - 10:04
     **/
    public int getListSize() {
        return listSize;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int length = 23;
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        int pageSize = 6;//每页条数
        System.out.println(list);

        ListPageUtil<Integer> listPageUtil = new ListPageUtil<>(list, pageSize);
        System.out.println("List size: " + listPageUtil.getListSize());//总数据条数
        System.out.println("Page count: " + listPageUtil.getPageCount());//分成了多少页
        System.out.println("Page size: " + listPageUtil.getPageSize());//每页条数，如果大于默认条数，就去这个值
        System.out.println("First page: " + listPageUtil.getFistPage());//第一页 导航页
        System.out.println("Last page: " + listPageUtil.getLastPage());//最后一页

//        while (listPageUtil.hasNext())
//        {
//            System.out.println("Page index: " + listPageUtil.getIndex());
//            System.out.println("Next page: " + listPageUtil.nextPage());
//        }

    }
}

