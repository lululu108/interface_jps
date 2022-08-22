package com.example.demo.member_master;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.DesignUserMapper;

@Service
@Transactional
public class DesignUserList {

	@Autowired
	DesignUserMapper designUserMapper;

	public List<DesignUser> getUserList() {
		List<DesignUser> userList = designUserMapper.selectAll();
		return userList;
	}
}