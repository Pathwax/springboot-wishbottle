package com.hust25.wishbottle.controller;

import com.hust25.wishbottle.entity.WishBottle;
import com.hust25.wishbottle.util.DataModel;
import com.hust25.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/wishbottle")
public class WishBottleController {

    @Autowired
    WishBottleService wishBottleService;


//测试修改git
//    第二行

    /**
     * 查找公开树洞
     *
     * @param writerId
     * @return
     */
    @ResponseBody
    @RequestMapping("/getallbottle")
    public DataModel findAllBottle(@RequestBody String writerId) {
        DataModel model = new DataModel();
        try {
            model.setData(wishBottleService.findAllByWriterid(writerId));
        } catch (Exception e) {
            model.setCode(500);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }



    /**
     * 查找所有回复
     *
     * @param receiverId
     * @return
     */
    @ResponseBody
    @RequestMapping("/getallreply")
    public DataModel findAllReply(@RequestBody String receiverId) {
        DataModel model = new DataModel();
        try {
            model.setData(wishBottleService.findAllByReceiverid(receiverId));
        } catch (Exception e) {
            model.setCode(500);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }



    /**
     * 扔出心愿瓶
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/addwish")
    public DataModel addWish(@RequestBody WishBottle wishBottle) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(wishBottleService.addWishBottle(wishBottle));
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("接口调用失败");
        }

        return dataModel;
    }

    /**
     * 捞取心愿瓶
     * @param writerid
     * @return
     */
    @RequestMapping(value = "/getwish")
    public DataModel getWish(String writerid) {
        DataModel dataModel = new DataModel();
        try {
            WishBottle wishBottle = wishBottleService.getWishBottle(writerid);
            dataModel.setData(wishBottle);
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("接口调用失败");
        }
        return dataModel;
    }
}
