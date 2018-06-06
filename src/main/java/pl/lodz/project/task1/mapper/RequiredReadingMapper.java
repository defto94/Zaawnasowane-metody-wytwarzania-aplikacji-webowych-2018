/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import pl.lodz.project.task1.domain.Magazine;
import pl.lodz.project.task1.domain.RequiredReading;

/**
 *
 * @author defto
 */
@MapperScan
public interface RequiredReadingMapper {

    @Select("select * from required_reading")
    List<RequiredReading> findAll();
}
