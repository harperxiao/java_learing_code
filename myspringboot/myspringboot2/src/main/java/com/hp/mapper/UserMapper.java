package com.hp.mapper;

import com.hp.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
