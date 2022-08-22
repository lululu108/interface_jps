package com.example.demo.member_master;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DesignUserListController {

	@Autowired
	private DesignUserList DesignUserList;

	@RequestMapping(path = "/designuserlist", method = RequestMethod.GET)
	String index(Model model) {
		List<DesignUser> list = this.DesignUserList.getUserList();
	    model.addAttribute("list", list);
	    return "DesignUserList";
	}
}
