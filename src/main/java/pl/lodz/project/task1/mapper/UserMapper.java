/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import pl.lodz.project.task1.domain.Book;

import pl.lodz.project.task1.domain.User;

/**
 *
 * @author defto
 */
@MapperScan
public interface UserMapper {

    @Select("select * from user")
    @Results(value = {
        @Result(property = "books", javaType = List.class, column = "ID", many = @Many(select = "findBooksByUser")),
        @Result(property = "ID", javaType = int.class, column = "ID")
    })
    List<User> findAll();

    @Select("select * from book where book.ID = #{id}")
    List<Book> findBooksByUser(int id);
    
}
