package com.example.demo.memberclient_master;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TorihikiUserListController {

	@Autowired
	private TorihikiUserList torihikiUserList;
	
	@RequestMapping(path = "/torihikiuserlist", method = RequestMethod.GET)
	String index(Model model) {
		List<TorihikiUser> list = this.torihikiUserList.getUserList();
	    model.addAttribute("list", list);
	    return "torihikiUserList";
	}
}