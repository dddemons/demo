package com.junc.demo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.junc.demo.util.WebConstant;
@JsonIgnoreProperties(ignoreUnknown=true)
public class BaseVo {
    /**
     * 状态码
     */
    private Integer resultCode;
    /**
     * 提示
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String prompt;
    /**
     * 总数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer countTotal;
    /**
     * 当前操作者id
     */
    private String userId;

    private Object data;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /*
     * 默认为10
     * 默认查看第1页
     */
    private int pageSize=10;
    private int pageNo=1;

    public void operationSuccess() {
        resultCode = WebConstant.SERVICE_SUCCESS;
    }

    public void operationFail(){
        resultCode = WebConstant.SERVICE_ERROR;
    }


    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Integer getCountTotal() {
        return countTotal;
    }

    public void setCountTotal(Integer countTotal) {
        this.countTotal = countTotal;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
