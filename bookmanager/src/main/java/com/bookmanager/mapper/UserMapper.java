package com.bookmanager.mapper;

import com.bookmanager.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User getUserByUsername(String username);
    void changePassword(String username, String newPassword);
    String getPassword(String username);
}
