package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.memberclient_master.TorihikiUser;
import com.example.demo.memberclient_master.TorihikiUserForm;

@Mapper
public interface TorihikiUserMapper {
	List<TorihikiUser> selectAll();
}