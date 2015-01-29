package com.senacor.hh.set.generator

import com.senacor.hh.set.setDsl.Service

class MicroService {
	def static generateAbstractMicroService(Service service) '''
package com.senacor.services.«service.name»;


import com.senacor.services.base.MSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class AbstractMS«service.name» extends MSService {
    @Override
    public String getDescription() {
        return "«service.description»";
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
	'''
	
	def static generateMicroServiceImpl(Service service) '''
package com.senacor.services.«service.name»;


import com.senacor.services.base.MSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public abstract class MS«service.name»Impl extends AbstractMS«service.name» {
    @Override
    public String getDescription() {
        return "«service.description»";
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(MS«service.name»Impl.class, args);
    }
}
	'''
}