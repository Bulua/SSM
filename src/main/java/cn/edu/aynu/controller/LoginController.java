package cn.edu.aynu.controller;

import cn.edu.aynu.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @RequestMapping("/getVeriCode")
    public ModelAndView getVeriCode(String name, ModelAndView mv){
        String code = loginService.verificationCode(name);
        mv.addObject("code",code);
        mv.setViewName("index");
        return mv;
    }
}
