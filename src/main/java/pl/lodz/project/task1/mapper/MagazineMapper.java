/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import pl.lodz.project.task1.domain.Magazine;
import org.apache.ibatis.annotations.SelectKey;

/**
 *
 * @author defto
 */
@MapperScan
public interface MagazineMapper {

    @Select("select * from magazines")
    @Results(value = {
        @Result(property = "ID", javaType = int.class, column = "ID")
    })
    List<Magazine> findAll();
}
