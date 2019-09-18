package com.atnewstar.trace2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author XuKaiKai
 * @date 2019/9/18 18:25
 */
@RestController
public class MyController {

    private final Logger logger = LoggerFactory.getLogger(MyController.class);
    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace() {
        logger.info("===call trace-2===");
        return "trace-2被调用";
    }
}
