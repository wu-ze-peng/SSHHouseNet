package com.accp.action;

import com.accp.biz.TypeBiz;
import com.accp.biz.impl.TypeBizImpl;
import com.accp.entity.Type;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class TypeAction extends ActionSupport {
    private List<Type> result;

    private TypeBiz typeBiz = new TypeBizImpl();

    public String getTypeList(){
        result = typeBiz.getTypeList();
        return SUCCESS;
    }

    public List<Type> getResult() {
        return result;
    }

    public void setResult(List<Type> result) {
        this.result = result;
    }
}
