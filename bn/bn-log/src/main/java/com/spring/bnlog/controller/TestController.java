package com.spring.bnlog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

        @ResponseBody
        @GetMapping("/show")
        public String show() {
            log.debug("debug");
            log.info("info");
            log.warn("warn");
            log.error("error");
            return "show";
        }


}
