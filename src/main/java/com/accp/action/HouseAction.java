package com.accp.action;

import com.accp.biz.HouseBiz;
import com.accp.biz.impl.HouseBizImpl;
import com.accp.entity.House;
import com.accp.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.omg.PortableInterceptor.SUCCESSFUL;

import java.util.List;
import java.util.Map;

public class HouseAction extends ActionSupport {
    private List<House> result;
    private HouseBiz houseBiz = new HouseBizImpl();
    private House house;

    public String getHouseList(){
        Map<String, Object> session = ActionContext.getContext().getSession();
        User user = (User) session.get("user");
        result = houseBiz.getHouseListByUser(user.getId());
        return "success";
    }

    public String toAddHouse(){
        return "toAdd";
    }

    public String addHouse(){
        Map<String, Object> session = ActionContext.getContext().getSession();
        User user = (User) session.get("user");
        house.setUser(user);
        int result = houseBiz.addHouse(house);
        if(result == 1){
            return "success";
        }
        return "input";
    }

    public List<House> getResult() {
        return result;
    }

    public void setResult(List<House> result) {
        this.result = result;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
