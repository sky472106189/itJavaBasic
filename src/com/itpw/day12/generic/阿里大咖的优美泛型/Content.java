package com.itpw.day12.generic.阿里大咖的优美泛型;

public class Content<T> {

    private T data;

    private Integer totalCount;

    private Integer currentPage;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "Content{" +
        "data=" + data +
        ", totalCount=" + totalCount +
        ", currentPage=" + currentPage +
        '}';
    }
}
