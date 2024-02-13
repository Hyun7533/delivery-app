package com.delivery.deliveryback.join;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {
	
	private final JoinService joinService;

	@Autowired
	public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }
	
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String join() {
        return "pages/join/join";
    }

    @RequestMapping(value = "/join2", method = RequestMethod.POST)
    public String join2(@ModelAttribute JoinEntity joinEntity, Model model) {
        joinService.join(joinEntity);
        return "pages/join/join";
    }

}
