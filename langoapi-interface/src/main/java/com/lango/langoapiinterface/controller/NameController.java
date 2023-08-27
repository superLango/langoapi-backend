package com.lango.langoapiinterface.controller;

import com.lango.langoclientsdk.model.User;
import com.lango.langoclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 *
 * @author Lango
 * @version 1.0
 */
@RestController
@RequestMapping(("/name"))
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是：" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
////        String secretKey = request.getHeader("secretKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        // todo 实际情况应该是去数据库中查是否已分配给用户
//        if (!accessKey.equals("lango")) {
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
        // todo 判断和当前时间不能超过 5 分钟
//        if (timestamp){
//
//        }
        // todo 查询数据库的时候要把 secretKey 一起查出来分配给 genSign
//        String serverSign = SignUtils.genSign(body, "abcdefgh");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }
        String result = "POST 用户名是：" + user.getUsername();
        // 调用成功后，次数加一
        return result;
    }
}
