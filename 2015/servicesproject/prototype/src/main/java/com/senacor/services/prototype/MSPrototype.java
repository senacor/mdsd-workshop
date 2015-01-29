package com.senacor.services.prototype;


import com.senacor.services.base.MSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WinzingeR on 20.01.2015.
 */
@Controller
@EnableAutoConfiguration
public class MSPrototype extends MSService {
    @Override
    public String getDescription() {
        return "Dies ist der Prototyp";
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(MSPrototype.class, args);
    }
}
