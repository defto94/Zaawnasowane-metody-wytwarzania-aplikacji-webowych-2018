/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.mapper;

import pl.lodz.project.task1.domain.Book;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import pl.lodz.project.task1.domain.User;

/**
 *
 * @author defto
 */
@Mapper
public interface BookMapper {

    @Select("select book.AUTHOR,book.ID,book.ID_USER,book.TITLE from book JOIN user ON book.ID_USER = user.ID;")
    List<Book> findAll();

    @Insert("insert into book(TITLE,AUTHOR,ID_USER) values(#{TITLE},#{AUTHOR},#{ID_USER})")
    void insert(Book book);

    @Delete("DELETE FROM book WHERE ID = #{ID}")
    void delete(Book book);

    @Update("update book set TITLE=#{TITLE}, AUTHOR=#{AUTHOR} where ID=#{ID}")
    void update(Book book);

}
