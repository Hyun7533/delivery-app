package com.delivery.deliveryback.join;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {

    @GetMapping("/join")
    public String join() {
        return "/join/join";
    }

}
