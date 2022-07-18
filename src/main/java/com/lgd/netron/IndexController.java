package com.lgd.netron;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * Project: netron-springboot
 * Package: com.lgd.netron
 * Title: IndexController
 * Description: IndexController
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/7/18
 */

@Controller
@RequestMapping
public class IndexController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
