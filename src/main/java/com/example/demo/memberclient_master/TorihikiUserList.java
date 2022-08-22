package com.example.demo.memberclient_master;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.memberclient_master.TorihikiUser;
import com.example.demo.mapper.TorihikiUserMapper;

@Service
@Transactional
public class TorihikiUserList {

	@Autowired
	TorihikiUserMapper torihikiUserMapper;

	public List<TorihikiUser> getUserList() {
		List<TorihikiUser> userList = torihikiUserMapper.selectAll();
		return userList;
	}
}