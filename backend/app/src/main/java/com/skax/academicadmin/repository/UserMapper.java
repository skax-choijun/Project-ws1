package com.skax.academicadmin.repository;

import com.skax.academicadmin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT id, name, email FROM users")
    List<User> findAll();

    @Select("SELECT id, name, email, password, role FROM users WHERE email = #{email}")
    User findByEmail(String email);

    @org.apache.ibatis.annotations.Insert("INSERT INTO users(name, email, password, role) VALUES(#{name}, #{email}, #{password}, #{role})")
    void save(User user);
} 