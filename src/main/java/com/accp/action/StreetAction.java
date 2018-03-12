package com.accp.action;

import com.accp.biz.StreetBiz;
import com.accp.biz.impl.StreetBizImpl;
import com.accp.entity.Street;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class StreetAction extends ActionSupport{
    private List<Street> result;

    private StreetBiz streetBiz = new StreetBizImpl();

    public String getStreetList(){
        result = streetBiz.getStreetList();
        return SUCCESS;
    }

    public List<Street> getResult() {
        return result;
    }

    public void setResult(List<Street> result) {
        this.result = result;
    }
}
