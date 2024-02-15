package com.delivery.delivery.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menuInit() {
        return "pages/menu/menu";
    }

}
