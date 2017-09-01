package cn.xuqplus.action;

import cn.xuqplus.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class DemoAction extends ActionSupport {
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User user;

    public String aa() {
        return SUCCESS;
    }

    public String bb() {
        ActionContext context = ActionContext.getContext();
        Map map = new HashMap();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "cc");
        context.put("map", map);
        return ERROR;
    }
}
