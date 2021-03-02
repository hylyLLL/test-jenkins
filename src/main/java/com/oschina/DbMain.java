package com.oschina;

import cn.hutool.db.Db;
import lombok.SneakyThrows;

import java.util.Date;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/12/15 12:04
 * @Version 1.0
 **/
public class DbMain {
    @SneakyThrows
    public static void main(String[] args) {
//        直接sql语句操作  insert/update/delete
        for (int i = 0; i < 1000; i++) {
            Db.use().execute("insert into kettle_record(table_name,table_column_values,type,primary_id) values(?,?,?,?)", "test_insert", "\""+1+"\",\"hyly:"+i+"\",\"男\",null", 1, "\""+i+"\"");
//            Db.use().execute("insert into test_insert(primary_key,name,sex) values(?,?,?)",i,"hyly:"+1,"男" );
        }
    }
}
