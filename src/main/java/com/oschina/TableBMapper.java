package com.oschina;

import com.oschina.TableB;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TableBMapper {
    int insert(TableB record);

    int insertSelective(TableB record);
}
