package com.plf.security.oauth2.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panlf
 * @date 2020/3/16
 */
@RestController
@RequestMapping("/resource/")
public class JwtResourceController {


    @GetMapping("/app/get")
    public String appAPPResource(){
        return "app资源";
    }

    @GetMapping("/pc/get")
    public String pcAPPResource(){
        return "pc资源";
    }

}

