package com.atnewstar.eurekaconsumerfeign.controller;

import com.atnewstar.eurekaconsumerfeign.service.DCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xukaikai
 * @date 2019/9/16 10:48
 */
@RestController
public class DCController {
    @Autowired
    private DCService dcService;

    @RequestMapping("/consumer")
    public String consumer(){
        return dcService.consumer();
    }

}
