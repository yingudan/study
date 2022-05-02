package com.bage.study.jmeter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/db")
public class PingController {

    @RequestMapping("/mysql")
    public @ResponseBody String ping() {
        System.out.println(LocalDateTime.now());
        return "pang";
    }

}
