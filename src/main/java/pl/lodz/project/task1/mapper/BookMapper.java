/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.mapper;

import pl.lodz.project.task1.domain.Book;
import java.util.List;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

/**
 *
 * @author defto
 */
@MapperScan
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();
}
