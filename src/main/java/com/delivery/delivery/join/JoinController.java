package com.delivery.delivery.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping(value = "/saveMember", method = RequestMethod.POST)
    public String saveMember(@ModelAttribute JoinDTO joinDTO, Model model) {
        joinService.saveMember(joinDTO);
        return "pages/join/join";
    }

}
