package com.accp.action;

import com.accp.biz.DistrictBiz;
import com.accp.biz.impl.DistrictBizImpl;
import com.accp.entity.District;
import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class DistrictAction extends ActionSupport {
    private List<District> result;
    private DistrictBiz districtBiz = new DistrictBizImpl();

    public String getDistrictList(){
        List<District> districtList = districtBiz.getDistrictList();
        result = districtList;
        return SUCCESS;
    }

    public List<District> getResult() {
        return result;
    }

    public void setResult(List<District> result) {
        this.result = result;
    }
}
