package com.tingliao.action;

import com.tingliao.dubbodemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by Administrator on 2017/7/20.
 */
@Controller
public class TestController {
  @Autowired
    private TestService testService;

    @RequestMapping("/test.do")
    public void sayDubbo(){
        testService.test();
    }

    @RequestMapping("/tests.do")
    @ResponseBody
    public String testString(String str){
        String s = testService.testService(str);
        return s;
    }

}
