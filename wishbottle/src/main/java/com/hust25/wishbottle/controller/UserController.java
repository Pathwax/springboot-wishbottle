package com.hust25.wishbottle.controller;

import com.hust25.wishbottle.entity.User;
import com.hust25.wishbottle.util.DataModel;
import com.hust25.wishbottle.util.HttpUtil;
import com.hust25.wishbottle.service.UserService;
import com.hust25.wishbottle.entity.OpenIdJson;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    private String appID = "wx4d65b7c8d4f4f47f";
    private String appSecret = "58d4278654d55998973cf52ff7746276";

    @Autowired
    UserService userService;

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @RequestMapping("/adduser")
    public DataModel addUser(User user) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(userService.adduser(user));
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("调用接口失败");
        }
        return dataModel;
    }

    @PostMapping("/login")
    public String userLogin(@RequestParam("code") String code) throws IOException {
        String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + this.appID + "&secret="
                            + this.appSecret + "&js_code="
                            + code
                            + "&grant_type=authorization_code", null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        OpenIdJson openIdJson = mapper.readValue(result,OpenIdJson.class);
        return result;
    }




    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     */
    @RequestMapping("/finduser")
    public DataModel findUser(String id) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(userService.findUserById(id));
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("调用接口失败");
        }
        return dataModel;
    }


    @RequestMapping("/testuser")
    public DataModel testUser() {
        User user = new User();
        user.setUsername("james");
        user.setId("001");
        user.setAvatarUrl("没有头像");
        user.setTime(new Date());
        DataModel dataModel = new DataModel();
        dataModel.setData(user);
        return dataModel;
    }
}
