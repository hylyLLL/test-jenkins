package com.oschina.testjenkins;

import com.oschina.TableA;
import com.oschina.TableAMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/10/12 9:27
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    TableAMapper tableAMapper;

    @Transactional
    public String test(){
        TableA tableA=new TableA();
        tableA.setA("异常前");
        tableAMapper.insert(tableA);
//        int a=3/0;
        return "{\n\t\"message\":\"success\",\n\t\"data\":[{\"name\":\"胡小威\" , \"age\":20 , \"male\":true},{\"name\":\"赵小亮\" , \"age\":22 , \"male\":false}]\n}";
    }
}
