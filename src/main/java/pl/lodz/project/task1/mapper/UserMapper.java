/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import pl.lodz.project.task1.domain.User;

/**
 *
 * @author defto
 */

@MapperScan
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();
    
}
