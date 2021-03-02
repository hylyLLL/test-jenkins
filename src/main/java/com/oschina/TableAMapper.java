package com.oschina;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TableAMapper extends BaseMapper<TableA> {
    int insert(TableA record);

    int insertSelective(TableA record);

    List<TableA> list();
}
