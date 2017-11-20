package com.wl.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 云服务
 * @author by wl
 * @date 2017/11/17.
 */

@RestController
public class CloudService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name){
        return "hello";
    }
}
