package com.delivery.delivery.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {

    @GetMapping(value = "/menu")
    public String menuInit() {
        return "/pages/menu";
    }

}
