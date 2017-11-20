package com.wl;

import com.wl.api.CloudServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/16.
 */

@RestController
public class HiController {

    @Autowired
    private CloudServiceApi cloudServiceApi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return cloudServiceApi.hello(name);
    }
}
