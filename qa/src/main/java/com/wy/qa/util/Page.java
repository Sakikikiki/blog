package com.wy.qa.util;

import java.util.List;

public class Page<T> {
    private List<T> data;       //分页中的数据集合
    private int pageNo;         //当前页码
    private int pageSize;       //每页显示的mood数量
    private int firstPageNo;    //首页的页码
    private int nextPageNo;     //下一页的页码
    private int prePageNo;      //上一页的页码
    private int lastPageNo;     //尾页的页码
    private int cnt;            //mood总数

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getNextPageNo() {
        if (this.pageNo == this.getLastPageNo()) {
            return this.getLastPageNo();
        } else {
            return this.pageNo + 1;
        }
    }

    public int getPrePageNo() {
        if (this.pageNo == 1) {
            return 1;
        } else {
            return this.pageNo - 1;
        }
    }

    public int getLastPageNo() {
        return cnt % pageSize == 0 ? cnt / pageSize : cnt / pageSize + 1;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
