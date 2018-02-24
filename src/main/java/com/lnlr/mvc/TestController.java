package com.lnlr.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author 雷洪飞 on 10:14 2018/2/24.
 * desc 测试mvc配置
 */
@RestController()
@RequestMapping("/lnlr")
public class TestController {

    @GetMapping("/test")
    public ModelAndView test() {
        System.out.println("进入test....");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("time", new Date());
        return modelAndView;
    }
}
